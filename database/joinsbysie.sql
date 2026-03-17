create database joinss;
use joinss;
drop table sale;
CREATE TABLE product (
    pid INT PRIMARY KEY,
    pname VARCHAR(50),
    category VARCHAR(50),
    price INT
);
CREATE TABLE sale (
    sid INT PRIMARY KEY,
    pid INT,
    cid INT,
    customerid INT,
    sale_date DATE,
    quantity INT,
    totalAmount INT,
    FOREIGN KEY (pid) REFERENCES product(pid),
     FOREIGN KEY (cid) REFERENCES customer(cid)
);

CREATE TABLE customer (
    cid INT PRIMARY KEY,
    name VARCHAR(50),
    city VARCHAR(50),
    joindate DATE
);
INSERT INTO customer VALUES
(1003, 'Amit', 'Delhi', '2024-06-10'),
(1002, 'Rina', 'Mumbai', '2025-01-15');

INSERT INTO product (pid, pname, category, price) VALUES
(1, 'shrit', 'cloth', 800),
(2, 'pant', 'cloth', 500),
(3, 'jaktiy', 'cloth', 1200),
(4, 'shirt', 'cloth', 600);


SELECT p.pid, p.pname, sum(s.quantity) AS total_sold
FROM sale s
JOIN product p ON s.pid = p.pid
GROUP BY p.pid, p.pname
ORDER BY total_sold DESC;

SELECT 
    MONTH(sale_date) AS month,
    YEAR(sale_date) AS year,
    SUM(totalAmount) AS monthly_revenue
FROM sale
GROUP BY YEAR(sale_date), MONTH(sale_date)
ORDER BY year, month;