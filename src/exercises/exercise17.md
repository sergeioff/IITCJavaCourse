1. Write a query to display the names (first_name, last_name) and salary for all employees whose salary is not in the range $10,000 through $15,000

    ```sql
    select FIRST_NAME, LAST_NAME, SALARY
    from employees
    where SALARY not between 10000 and 15000;
    ```

2. Write a query to display the names (first_name, last_name) and department ID of all employees in departments 30 or 100 in ascending alphabetical order by department ID. 

    ```sql
    select FIRST_NAME, LAST_NAME, DEPARTMENT_ID
    from employees
    where DEPARTMENT_ID in (30, 100)
    order by DEPARTMENT_ID asc;
    ```

3. Write a query to display the names (first_name, last_name) and hire date for all employees who were hired in 1987. 

    ```sql
    select FIRST_NAME, LAST_NAME, HIRE_DATE
    from employees
    where extract(year from HIRE_DATE) = 1987;
    ```

4. Write a query to display the last name, job, and salary for all employees whose job is that of a Programmer or a Shipping Clerk, and whose salary is not equal to $4,500, $10,000, or $15,000. 

    ```sql
    select LAST_NAME, JOB_TITLE, SALARY
    from employees inner join jobs on employees.JOB_ID = jobs.JOB_ID
    where JOB_TITLE in ('Programmer', 'Shipping Clerk')
    and SALARY not in (4500, 10000, 15000);
    ```

5. Write a query to display the last names of employees whose names have exactly 6 characters. 

    ```sql
    select LAST_NAME
    from employees
    where length(FIRST_NAME) = 6;
    ```

6. Write a query to display the last names of employees having 'e' as the third character.

    ```sql
    select LAST_NAME
    from employees
    where LAST_NAME like '__e%';\
    ```

7. Write a SQL statement insert rows from countries table to country_new table. Assume that, the country_new table is empty.

    ```sql
    create table if not exists country_new as select * from countries;
    ```

8. Write a query to update the portion of the phone_number in the employees table, within the phone number the substring '124' will be replaced by '999'.
    
    ```sql
    set SQL_SAFE_UPDATES=0;
    update employees
    set PHONE_NUMBER = replace(PHONE_NUMBER, 124, 999);
    set SQL_SAFE_UPDATES=1;
    ```

9. Write a query to get the details of the employees where the length of the first name greater than or equal to 8. 

    ```sql
    select *
    from employees
    where length(FIRST_NAME) >= 8;
    ```

10. Write a query to append '@example.com' to email field.

    ```sql
    set SQL_SAFE_UPDATES=0;
    update employees
    set EMAIL = concat(EMAIL, '@example.com');
    set SQL_SAFE_UPDATES=1;
    ```

11. Write a query to display the length of first name for employees where last name contain character 'c' after 2nd position.

    ```sql
    select length(FIRST_NAME)
    from employees
    where LAST_NAME like '__%c%';
    ```

12. Write a query to find the addresses (location_id, street_address, city, state_province, country_name) of all the departments. 

    ```sql
    select DEPARTMENT_NAME, d.LOCATION_ID, STREET_ADDRESS, CITY, STATE_PROVINCE, COUNTRY_NAME
    from departments d inner join locations l on d.LOCATION_ID = l.LOCATION_ID
    inner join countries c on l.COUNTRY_ID = c.COUNTRY_ID;
    ```

13. Write a query to find the names (first_name, last name), department ID and name of all the employees. 

    ```sql
    select FIRST_NAME, LAST_NAME, e.DEPARTMENT_ID, DEPARTMENT_NAME
    from employees e inner join departments d on e.DEPARTMENT_ID = d.DEPARTMENT_ID;
    ```

14. Find the names (first_name, last_name), job, department number, and department name of the employees who work in London.

    ```sql
    select FIRST_NAME, LAST_NAME, JOB_TITLE, e.DEPARTMENT_ID, DEPARTMENT_NAME
    from employees e inner join departments d on e.DEPARTMENT_ID = d.DEPARTMENT_ID
    inner join jobs j on e.JOB_ID = j.JOB_ID
    inner join locations l on d.LOCATION_ID = l.LOCATION_ID
    where CITY = 'London';
    ```