create database trade;

use trade;

create table User(
userid int(10) primary key,
username varchar(20)
);

create table stock(
stockid int primary key,
stockname varchar(30),
quantity int,
price double,
brokerage float
);

insert into stock values
(1,'laptop',10,20000,5),
(2,'mouse',20,500,5),
(3,'keyboard',15,1000,5),
(4,'mobile',20,10000,5),
(5,'printer',30,3000,5);

select *from user;

CREATE TABLE `cart` (
  `buy_id` int(11) NOT NULL AUTO_INCREMENT,
  `quantity_order` int(11) DEFAULT NULL,
  `stock_id` int(11) DEFAULT NULL,
  `stock_name` varchar(255) DEFAULT NULL,
  `total_price` double DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`buy_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

select *from cart;
CREATE TABLE `stock` (
  `stock_id` int(11) NOT NULL,
  `stock_name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `brokerage` float DEFAULT NULL,
  PRIMARY KEY (`stock_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

select *from stock;

insert into user values(1,'Sri'),(2,'Keerthi');


drop table buy;
drop table stock;
drop table user;
drop database trading;