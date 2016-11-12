1. Write a query to list the number of jobs available in the employees table. 

    ```sql
    select count(distinct JOB_ID)
    from employees;
    ```

    or

    ```sql
    select count(*)
    from (select count(*)
    from employees
    group by JOB_ID) as jobs;
    ```

2. Write a query to get the total salaries payable to employees.

    ```sql
    select sum(SALARY)
    from employees;
    ```

3. Write a query to get the maximum salary of an employee working as a Programmer. 

    ```sql
    select max(SALARY)
    from employees
    where JOB_ID = "IT_PROG";
    ```

4. Write a query to get the average salary and number of employees working the department 90. 

    ```sql
    select avg(SALARY) as 'average salary', count(*) as 'number of employees'
    from employees
    where DEPARTMENT_ID = 90;
    ```

5. Write a query to get the highest, lowest, sum, and average salary of all employees. 

    ```sql
    select max(SALARY), min(SALARY), sum(SALARY), avg(SALARY)
    from employees;
    ```

6. Write a query to get the number of employees with the same job.

    ```sql
    select JOB_ID, count(*)
    from employees
    group by JOB_ID;
    ```

7. Write a query to get the difference between the highest and lowest salaries. 

    ```sql
    select max(SALARY) - min(SALARY)
    from employees;
    ```

8. Write a query to find the manager ID and the salary of the lowest-paid employee for that manager.
    
    ```sql
    select MANAGER_ID, min(SALARY)
    from employees
    group by MANAGER_ID;
    ```

9. Write a query to find the names (first_name, last_name) and the salaries of the employees who have a higher salary than the employee whose last_name='Bull'.

	```sql
	select e.FIRST_NAME, e.LAST_NAME, e.SALARY
	from employees e inner join employees o on o.LAST_NAME = 'Bull'
	where e.SALARY > o.SALARY;
	```

	or

    ```sql
    select FIRST_NAME, LAST_NAME, SALARY
    from employees
    where SALARY > (select distinct SALARY
    from employees
    where LAST_NAME = 'Bull');
    ```

10. Write a query to find the names (first_name, last_name) of all employees who works in the IT department.

	```sql
	select FIRST_NAME, LAST_NAME
	from employees e inner join departments d on e.DEPARTMENT_ID = d.DEPARTMENT_ID
	where DEPARTMENT_NAME = 'IT';
	```

	or
    
    ```sql
    select FIRST_NAME, LAST_NAME
    from employees
    where DEPARTMENT_ID = (select distinct DEPARTMENT_ID
    from departments
    where DEPARTMENT_NAME = 'IT');
    ```

11. Find the employee ID, job title, number of days between ending date and starting date for all jobs in department 90 from job history. 

    ```sql
    select jh.EMPLOYEE_ID, JOB_TITLE, datediff(END_DATE, START_DATE)
    from job_history jh inner join employees e on jh.EMPLOYEE_ID = e.EMPLOYEE_ID
    inner join jobs j on e.JOB_ID = j.JOB_ID
    where jh.DEPARTMENT_ID = 90;
    ```

12. Write a query to display the department ID, department name and manager first name. 

    ```sql
    select d.DEPARTMENT_ID, DEPARTMENT_NAME, FIRST_NAME as 'Manager'
    from departments d inner join employees on d.MANAGER_ID = employees.EMPLOYEE_ID;
    ```

13. Write a query to get the total salary, maximum, minimum, average salary of employees (job ID wise), for department ID 90 only.

    ```sql
    select sum(SALARY), max(SALARY), min(SALARY), avg(SALARY)
    from employees
    where DEPARTMENT_ID = 90;
    ```

14. Write a query to get the average salary for all departments employing more than 10 employees.

    ```sql
    select DEPARTMENT_ID, avg(SALARY)
    from employees
    group by DEPARTMENT_ID
    having count(*) > 10; 
    ```

    or

    ```sql
    select DEPARTMENT_ID, avg(SALARY)
    from employees
    where DEPARTMENT_ID in
    (select DEPARTMENT_ID
    from
    (select DEPARTMENT_ID, count(*) as num
    from employees
    group by DEPARTMENT_ID) as d
    where d.num > 10)
    group by DEPARTMENT_ID;
    ```

15. Write a query to get the job ID and maximum salary of the employees where maximum salary is greater than or equal to $4000.

	```sql
	select JOB_ID, max(SALARY) as max_salary
	from employees
	group by JOB_ID
	having max_salary >= 4000;
	```
    
    or

    ```sql
    select * from
    (select JOB_ID, max(SALARY) as m
    from employees
    group by JOB_ID) as r
    where r.m >= 4000;
    ```