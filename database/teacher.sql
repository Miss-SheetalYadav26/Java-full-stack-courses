use college1;
select * from  teacher;


select * from teacher where salary>=8000 and (city='pune' or city='mumbai');
select* from teacher where salary>25000 and city in("pune","mumbai");

-- as alias name
select tis as Teacher_ID, tname as teacher_name,
 qulifi as Qulification, age as age, subject as subject,
 city as City, gender as Gender where age>=28;

 -- 1 find the name salary and city age is 28
 SELECT tname AS Teacher_name ,salary as Teacher_Salary, city as City
FROM teacher where age>28;

-- 2 find the name salary and city age is 28
SELECT tname AS Teacher_name, city as City ,salary as Teacher_Salary
FROM teacher where age>25 and salary>25000;

-- 3 find the name salary and city age is 28
SELECT tname AS Teacher_name, city as City,salary as Teacher_Salary
FROM teacher where city in('pune' or'mumbai') and salary>25000;

-- 4 
select * from teacher where city= 'mumbai';
-- 5
SELECT * FROM teacher ORDER BY tname ASC;
-- 6
SELECT * FROM teacher ORDER BY salary ASC;

-- 7
UPDATE teacher SET city = 'Baroda' WHERE tid=104;

UPDATE teacher SET tname = 'rohit' ,city = 'nashik' WHERE tid=107;

DELETE FROM teacher WHERE salary=28000;
DELETE FROM teacher WHERE tname ='manju';

select* from teacher where city not like 'pune';
select* from teacher where not city = 'pune';

-- alter
alter table teacher add blood_group int;
alter table teacher modify column blood_group varchar(25);
alter table teacher drop blood_group;
desc teacher;