CREATE TABLE Department (
  dept_id INT PRIMARY KEY,
  dept_name VARCHAR(20)
);

CREATE TABLE Employee (
  eid INT PRIMARY KEY,
  ename VARCHAR(20),
  did INT,
  FOREIGN KEY (did) REFERENCES Department(dept_id)
);
drop table employee;
drop table Department ;
delete from employee where eid=101;
delete from Department where dept_id=1;

INSERT INTO Department VALUES (1, 'IT'),(2, 'HR'),(3, 'CA'),(4, 'Markiting'),(5, 'finamce'),(6, 'CS');
INSERT INTO employee VALUES (101, 'Sita',1 ),(102, 'gita',2 ),(103, 'mita',3 ),(104, 'Sigta',4 ),(105, 'mita',5 ),(106, 'pita',6);
-- show table
select * from employee;
select* from Department;
-- structure
DESCRIBE Department;
DROP TABLE employee, Department;
-- CURD operation on table

UPDATE employee SET ename="kittu" where eid=104;


-- INNER JOIN
-- Returns only matching rows from both tables.
select e.eid, e.ename, e.did, d.dept_id
FROM employee e inner join .eid, e.ename, e.did, d.dept_id;



SELECT e.eid, e.ename, e.did, d.dept_id
FROM employee 
e.eid, e.ename, e.did, d.dept_id
FROM employee e

SELECT e.eid, e.ename, e.did, d.dept_id, d.dept_name
FROM employee e
right JOIN Department d
ON e.did = d.dept_id;


SELECT e.eid, e.ename, e.did, d.dept_id, d.dept_name
FROM employee e
INNER JOIN Department d
ON e.did = d.dept_id;



SELECT DISTINCT d.dname
FROM employee AS e
INNER JOIN department AS d
ON e.depid = d.did
WHERE e.salary > 30000;
