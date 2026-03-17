create database hotel;
use hotel;
create table customer(
cid int primary key, cname varchar(20), age int, country varchar(30)
);
insert into customer(cid,cname,age,country) values(101,'sheetal',28,'india');
insert into customer values(102,'pini',28,'china'),
(103,'niki',21,'japan'),
(104,'rina',25,'uk'),
(105,'piki',35,'usa'),
(106,'pihu',35,'amarika'),
(107,'miku',46,'austaliya'),
(108,'sheta',19,'srilanka'),
(109,'deep',23,'india'),
(110,'shep',23,'india');

select * from customer;
-- select the record of who are from australia

select * from customer where country = 'austaliya' ;

-- record of customer who's age is more then 35

select * from customer where age>35; 

-- customer number less then 105
select * from customer where cid<105;

-- add new column of room

alter table customer add rno int ;

select* from customer;
-- upadate name of customer as prashant
  update customer set cname ='prashant' where cname='shep';  
 
 UPDATE customer SET cname = 'prashant' WHERE cid = 101;

-- SET SQL_SAFE_UPDATES = 0;
-- UPDATE customer SET cname = 'prashant1' WHERE cname = 'shep';
-- SET SQL_SAFE_UPDATES = 1;

select* from customer;

-- delte one record of 106

delete from customer where cid=106;

-- add room number 

-- update customer set rno=1 where cid=101;
UPDATE customer
SET rno = CASE
  WHEN cid = 101 THEN 1
  WHEN cid = 102 THEN 2
  WHEN cid = 103 THEN 3
  WHEN cid = 104 THEN 4
  WHEN cid = 105 THEN 5
  WHEN cid = 107 THEN 7
  WHEN cid = 108 THEN 8
  WHEN cid = 109 THEN 9
  WHEN cid = 110 THEN 10
END
WHERE cid IN (101, 102, 103, 104,105,107,108,109,110);

-- belongs to india

select * from customer where country='india';

-- update the age 25 to 21

update customer set age =21 where age=25;

-- delete srilanka record

delete from customer where country='srilanka';
select* from customer;