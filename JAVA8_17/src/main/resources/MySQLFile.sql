SELECT * FROM customers;

-- 1. Get all employee details from the employee table
Select * from customers;
-- 2. Get First_Name,Last_Name from employee table

SELECT customerName FROM customers;


-- 3. Get First_Name from employee table using alias name “Employee Name”

SELECT customerName AS cst_name FROM customers;


-- 4. Get First_Name from employee table in upper case
SELECT UPPER(customerName) AS upr_cst_name FROM customers;

-- 5. Get First_Name from employee table in lower case
SELECT LOWER(customerName) AS lwr_cst_name FROM customers;


-- 6. Get unique DEPARTMENT from employee TABLE

SELECT DISTINCT city FROM customers;

-- 7. Select first 3 characters of FIRST_NAME from EMPLOYEE

SELECT substr(customerName,1,3) FROM customers;


-- 8. Get position of 'o' in name 'John' from employee tabl
SELECT LOCATE('a',customerName),customerName FROM customers;

-- 9. Get FIRST_NAME from employee table after removing white spaces from right side

LPAD(str, len [,padstr])
LTRIM(str)
RTRIM(str)
LTRIM(str)

SELECT customerName,LTRIM(customerName) FROM customers; 

SELECT customerName,LENGTH(customerName) len FROM customers; 


-- 11. Get length of FIRST_NAME from employee table

SELECT customerName,Length(customerName) FROM customers; 


-- 12. Get First_Name from employee table after replacing 'o' with '$'

SELECT customerName,replace(customerName,'A','Z') FROM customers; 

-- 13. Get First_Name and Last_Name as single column from employee table separated by __

SELECT CONCAT(contactFirstName,'#',contactLastName) FROM customers;

-- 14. Get FIRST_NAME ,Joining year,Joining Month and Joining Date from employee 
SELECT * FROM customers;

SELECT orderDate,YEAR(orderDate) y,MONTHNAME(orderDate) m FROM orders ORDER BY orderDate;

-- 15. Get all employee details from the employee table order by First_Name Ascending

SELECT * FROM customers ORDER BY customerNumber DESC;

-- 17. Get all employee details from the employee table order by First_Name Ascending and Salary descending
SELECT COUNT(*) FROM customers ORDER BY customerNumber DESC;
SELECT * FROM customers ORDER BY creditlimit ASC;


-- 18. Get employee details from employee table whose employee name is “John

SELECT * FROM customers WHERE customerName LIKE '%At%' OR customerName LIKE '%ag%' ;


-- 21. Get employee details from employee table whose first name starts with 'J'
Select * from customers where customerName like 'J%'
-- 22. Get employee details from employee table whose first name contains 'o'
Select * from customers where customerName like '%o%'
-- 23. Get employee details from employee table whose first name ends with 'n'
Select * from customers where customerName like '%n'


-- 24. Get employee details from employee table whose first name ends with 'n' and name 
-- contains 4 letters
Select * from customers where FIRST_NAME like '___n' (Underscores)

SELECT * FROM customers WHERE customerName LIKE '__j';

-- 25. Get employee details from employee table whose first name starts with 'J' and name 
-- contains 4 letters
Select * from customers where customerName like 'J___'; (Underscores)
-- 26. Get employee details from employee table whose Salary greater than 600000
Select * from customers where creditlimit > 600000;
-- 27. Get employee details from employee table whose Salary less than 800000
Select * from customers where creditlimit < 800000;
-- 28. Get employee details from employee table whose Salary between 500000 and 800000
Select * from customers where creditlimit between 500000 and 800000;
-- 29. Get employee details from employee table whose name is 'John' and 'Michael'
Select * from customers where customerName in ('John','Michael');


-- 30. Get employee details from employee table whose joining year is “2013”
SELECT * FROM orders
SELECT * FROM orders WHERE to_char(shippedDate,'yyyymm')='';

SELECT DATE_FORMAT(shippedDate,'%Y-%m-%d') FROM orders

SELECT * FROM orders WHERE shippedDate='2003-01-10'





-- 41. Get department,total salary with respect to a department from employee table.

SELECT COUNT(orderNumber),customerNumber FROM orders  GROUP BY customerNumber HAVING COUNT(orderNumber)<=2

SELECT COUNT(orderNumber),customerNumber FROM orders  GROUP BY customerNumber HAVING COUNT(orderNumber)>=2 ORDER BY  customerNumber asc

SELECT * FROM orders  GROUP BY customerNumber 


select FIRST_NAME,INCENTIVE_AMOUNT from employee a inner join incentives B  on A.EMPLOYEE_ID = B.EMPLOYEE_REF_ID and INCENTIVE_AMOUNT > 3000
SELECT * FROM payments;
SELECT * FROM orders;

SELECT p.customerNumber,SUM(p.amount) FROM payments p LEFT outer join orders o on p.customerNumber=o.customerNumber GROUP BY p.customerNumber; 

SELECT p.customerNumber,SUM(p.amount) FROM payments p GROUP BY p.customerNumber;

select * from payments order by amount desc LIMIT 3,1



select * from employee order by salary desc limit 2

 select * from employee order by salary desc limit N


select min(SALARY) from (select * from employee order by salary desc limit 2) a

select min(SALARY) from (select * from employee order by salary desc limit N) a


SELECT * FROM employees;

SELECT MAX(employeenumber),MIN(employeenumber) FROM employees;








