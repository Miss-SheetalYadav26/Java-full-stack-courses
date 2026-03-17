use hotel;
create table customer(cid int primary key, cname varchar(20), cage int, country varchar(30));

insert into customer(cid, cname, cage, country) values(101, 'sheetal', 25, 'india');

insert into customer(cid, cname, cage, country) values(102, 'tushar', 44, 'uganda'),
(103, 'deep', 21, 'austila'),(104, 'adinath', 23, 'srilanka'),(105, 'poonam', 35, 'japan'),
(106, 'sandy', 35, 'india'),(107, 'niki', 21, 'india'),(108, 'sheeta', 26, 'india')
,(109, 'pinki', 27, 'china'),(110, 'tina', 54, 'uk'),(111, 'rina', 35,'india');
select * from customer;
