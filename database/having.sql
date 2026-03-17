create database sqls;
CREATE TABLE Teacher (
    id INT PRIMARY KEY,
    tname VARCHAR(50),
    tcity VARCHAR(50),
    tsalary DECIMAL(10,2),
    tage INT,
    tcountry VARCHAR(50)
);
INSERT INTO Teacher VALUES
(1, 'Ravi', 'Delhi', 45000, 35, 'India'),
(2, 'Sita', 'Mumbai', 55000, 40, 'India'),
(3, 'John', 'London', 60000, 12, 'UK'),
(4, 'John', 'London', 60000, 13, 'UK'),
(5, 'John', 'London', 60000, 45, 'UK');

select max(tsalary) as max_age from Teacher ;
select* from teacher where tcity="delhi" and tcountry='india';
select min(tsalary) as min_sal from Teacher ;
select avg(tsalary) as min_sal from Teacher ;
select* from teacher where tcountry='india' and tsalary in (60000 or 55000);
SELECT tname, tcountry FROM Teacher ORDER BY tcountry ASC, tname ASC;

CREATE TABLE Car (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    color VARCHAR(30),
    price DECIMAL(12,2),
    launch_date DATE,
    country VARCHAR(50)
);

INSERT INTO Car VALUES
(101, 'Swift', 'Red', 650000, '2022-03-15', 'India'),
(102, 'City', 'White', 1200000, '2021-06-10', 'India'),
(105, 'BMW X1', 'Black', 4500000, '2020-01-20', 'Germany');
SELECT MIN(price) AS minimum_price FROM Car;

SELECT SUM(price) AS total_price FROM Car;
UPDATE Car SET launch_date = CURDATE() WHERE id = 105;
SELECT * FROM Car WHERE country = 'India' AND price > 200000;
SELECT COUNT(*) AS total_cars FROM Car;
SELECT MIN(price) AS cheapest_price FROM Car;
SELECT MAX(price) AS costliest_price FROM Car;
SELECT name FROM Car WHERE name LIKE '%A%' AND price > 2000000;
SELECT name FROM Car WHERE name LIKE 'A%' OR name LIKE 'V%';
SELECT * FROM teacher WHERE tname LIKE '%H%H%' AND tage > 45;
SELECT * FROM teacher WHERE tage BETWEEN 25 AND 35;
-- group by
-- select column_name from table_name where condition group by colum_name
select tcity, count(tcity) from teacher group by tcity;
SELECT tage, COUNT(tage) AS total FROM teacher GROUP BY tage;
SELECT color, COUNT(color) AS total FROM car GROUP BY color;
SELECT tcity, COUNT(*) AS total_teachers FROM teacher GROUP BY tcity;
-- having
-- SELECT column, aggregate_function(column) FROM table GROUP BY column HAVING condition;
SELECT tcity, COUNT(tcity)  FROM teacher GROUP BY tcity HAVING COUNT(tcity) >= 2;
SELECT tage, COUNT(tage)  FROM teacher GROUP BY tage HAVING COUNT(tage)>=45;
-- SELECT color, COUNT(color)  FROM car GROUP BY tage HAVING COUNT(color) >=1;

