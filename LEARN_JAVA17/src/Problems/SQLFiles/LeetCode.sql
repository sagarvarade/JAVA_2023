#1 Write your MySQL query statement below
select name,population,aread from world where area>=3000000 or population>=25000000;

#2
select product_id from products where low_fats='Y' and recyclable='Y';

#3
select name from customer where referee_id not in (2) or referee_id is null;

#4
select name as Customers from Customers where id not in (select distinct customerId from orders);

#5
select employee_id, case when mod(employee_id,2)!=0 and !(name like 'M%') then salary else 0 end as bonus from Employees order by employee_id;


#6
update Salary set sex=(case when sex='m' then 'f' else 'm' end);

#7
delete from Person where id not IN (SELECT id from (select min(id) id from Person group by email) c);
