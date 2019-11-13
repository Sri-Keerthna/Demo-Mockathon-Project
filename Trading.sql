create database trading;
use trading;
create table user
(
userid int(10) auto_increment not null ,
username varchar(20),
PRIMARY KEY (`userid`)
);
create table stock
(
userid int(10),
stockid int auto_increment,
sname varchar(20),
qty int(10),
price long,
brokerage float,
PRIMARY KEY (`stockid`),
foreign key(userid) references user(userid) 
);

select *from stock;
CREATE TABLE `cart` (
  `buy_id` int(11) NOT NULL AUTO_INCREMENT,
  `quantity_order` int(11) DEFAULT NULL,
  `stock_id` int(11) DEFAULT NULL,
  `stock_name` varchar(255) DEFAULT NULL,
  `total_price` double DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`buy_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
drop table stock;
insert into stock values(1,stockid,"HCL",10,5000,5);
insert into stock values(1,stockid,"Infosys",20,20000,5);
insert into stock values(2,stockid,"Mobile",30,10000,5);
select *from cart;
select *from user;
insert into user values(userid,"Sri");
insert into user values(userid,"Keerthi");

delete from stock where stockid=4;