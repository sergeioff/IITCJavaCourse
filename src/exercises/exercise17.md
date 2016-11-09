1. Write a query to display the names (first_name, last_name) and salary for all employees whose salary is not in the range $10,000 through $15,000

```
select FIRST_NAME, LAST_NAME, SALARY
from employees
where SALARY not between 10000 and 15000;
```

2. Write a query to display the names (first_name, last_name) and department ID of all employees in departments 30 or 100 in ascending alphabetical order by department ID. 

```
select FIRST_NAME, LAST_NAME, DEPARTMENT_ID
from employees
where DEPARTMENT_ID in (30, 100)
order by DEPARTMENT_ID asc;
```

3. Write a query to display the names (first_name, last_name) and hire date for all employees who were hired in 1987. 

```
select FIRST_NAME, LAST_NAME, HIRE_DATE
from employees
where extract(year from HIRE_DATE) = 1987;
```

4. Write a query to display the last name, job, and salary for all employees whose job is that of a Programmer or a Shipping Clerk, and whose salary is not equal to $4,500, $10,000, or $15,000. 

```
select LAST_NAME, JOB_TITLE, SALARY
from employees inner join jobs on employees.JOB_ID = jobs.JOB_ID
where JOB_TITLE in ('Programmer', 'Shipping Clerk')
and SALARY not in (4500, 10000, 15000);
```

5. Write a query to display the last names of employees whose names have exactly 6 characters. 

```
select LAST_NAME
from employees
where length(FIRST_NAME) = 6;
```

6. Write a query to display the last names of employees having 'e' as the third character.

```
select LAST_NAME
from employees
where LAST_NAME like '__e%';\
```

7. Write a SQL statement insert rows from countries table to country_new table. Assume that, the country_new table is empty.

```
create table if not exists country_new as select * from countries;
```

8. Write a query to update the portion of the phone_number in the employees table, within the phone number the substring '124' will be replaced by '999'.

```
set SQL_SAFE_UPDATES=0;
update employees
set PHONE_NUMBER = replace(PHONE_NUMBER, 124, 999);
set SQL_SAFE_UPDATES=1;
```

9. Write a query to get the details of the employees where the length of the first name greater than or equal to 8. 

```
select *
from employees
where length(FIRST_NAME) >= 8;
```

10. Write a query to append '@example.com' to email field.

```
set SQL_SAFE_UPDATES=0;
update employees
set EMAIL = concat(EMAIL, '@example.com');
set SQL_SAFE_UPDATES=1;
```

11. Write a query to display the length of first name for employees where last name contain character 'c' after 2nd position.

```
select length(FIRST_NAME)
from employees
where LAST_NAME like '__%c%';
```

12. Write a query to find the addresses (location_id, street_address, city, state_province, country_name) of all the departments. 

```
select DEPARTMENT_NAME, departments.LOCATION_ID, STREET_ADDRESS, CITY, STATE_PROVINCE, COUNTRY_NAME
from departments inner join locations on departments.LOCATION_ID = locations.LOCATION_ID
inner join countries on locations.COUNTRY_ID = countries.COUNTRY_ID;
```

13. Write a query to find the names (first_name, last name), department ID and name of all the employees. 

```
select FIRST_NAME, LAST_NAME, employees.DEPARTMENT_ID, DEPARTMENT_NAME
from employees inner join departments on employees.DEPARTMENT_ID = departments.DEPARTMENT_ID;
```

14. Find the names (first_name, last_name), job, department number, and department name of the employees who work in London.

```
select FIRST_NAME, LAST_NAME, JOB_TITLE, employees.DEPARTMENT_ID, DEPARTMENT_NAME
from employees inner join departments on employees.DEPARTMENT_ID = departments.DEPARTMENT_ID
inner join jobs on employees.JOB_ID = jobs.JOB_ID
inner join locations on departments.LOCATION_ID = locations.LOCATION_ID
where CITY = 'London';
```