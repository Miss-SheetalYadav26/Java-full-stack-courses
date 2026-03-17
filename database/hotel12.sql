
use  hotel;
drop table student;
-- primary key,not null,check, unique, default
create table student (
sid int primary key, 
-- no null value is 
sname varchar (10) not null,
-- its check case based on condition
 age int check(age>=18),
 -- no duplicate key and one null value allowed
 acard int unique, 
 -- it can take value by manually and also takes pre-set values
 city varchar (10) default 'pune'
);

-- value insertion in data
INSERT INTO Student (sid, sname, age, acard, city)
VALUES(1, 'Sita', 21, '123456789', 'Mumbai');
-- use defaut key
INSERT INTO Student (sid, sname, age, acard)
VALUES (2, 'Sita', 21, '122222789');

insert into Student (sid,sname,age,acard)
value(3,'pita',19, 1234567825);


-- not null
insert into Student (sid,sname,age)
value(4, 'sitaa',19 );
delete from student where sid=6;
-- unique key
insert into Student (sid,sname,age)
values(5, 'pitaa',19 ),
(6, 'mini',35);

insert into Student (sid,sname,age,acard)values
(8, 'mini',35, null);

INSERT INTO Student (sid, sname, age, acard, city)
VALUES(9, 'mita', 21, '12222339', 'nashik');
-- clausesss of AND OR NOT ,BETWEEN, IN 
-- AND
select* from student where city="pune" and age=19;
-- OR 
select* from student where city="PUNE" OR age=21;

-- NOT
select* from student where  NOT city='MUMBAI';
select* from student where city NOT LIKE "PUNE";
-- between not between  BETWEEN is used in the WHERE clause to select values within a given range.
select* from student where sid not  between 1 and 5; 
select* from student where sid   between 1 and 5; 

--  IN is used in the WHERE clause to match multiple values instead of writing many OR conditions.
SELECT * FROM Student WHERE city IN ('pune','nashik');


-- Wildcards are special symbols used with the LIKE operator to match patterns in text data. %  _

SELECT * FROM Student WHERE sname LIKE 'p%';
SELECT * FROM Student WHERE sname LIKE '%a';
SELECT * FROM Student WHERE sname LIKE '%t%';
-- undersore
SELECT * FROM Student WHERE sname LIKE '__%a';
SELECT * FROM Student WHERE sname LIKE 's_%';
SELECT * FROM Student WHERE sname LIKE 'S_ta';

-- for union and all union
create table student1 (
sid int primary key,  
sname varchar (10),
 age int check(age>=18),
 acard int unique, 
 city varchar (10) default 'pune'
);

INSERT INTO Student1(sid, sname, age, acard, city)
VALUES(1, 'Sita', 21, '123456789', 'Mumbai'),(2, 'nita', 21, '125555589', 'pune'),
(3, 'ram', 21, '1238888', 'nashik');
-- union its shows only one same its is slower
select sid , sname from student
union
select sid , sname from student1;

--  union all it is faster

select sid , sname from student
union all
select sid , sname from student1;

-- CREATE VIEW view_name AS SELECT column1, column2 FROM table_name WHERE condition;
-- A VIEW is a virtual table created from a SELECT query. It does not store data, it stores only the query.

CREATE VIEW student_view AS
SELECT sid, sname,age
FROM Student where age>=20;
-- delete view
drop VIEW student_view;

SELECT * FROM student_view;

select* from student;
select* from student1;

