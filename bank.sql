create database bank;
use bank;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `dob` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `pass_word` varchar(255) DEFAULT NULL,
  `phone_no`  double NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `account` (
  `account_no` bigint(20) NOT NULL auto_increment,
  `account_balance` bigint(20) DEFAULT NULL,
  `account_type` varchar(255) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`account_no`),
  foreign key(user_id) references user(user_id) 
) ENGINE=InnoDB AUTO_INCREMENT=100001 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

select *from user;
select *from account;

insert into account values(account_no,30000,'Savings',1);




drop table user;
drop table account;