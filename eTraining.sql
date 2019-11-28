create database eTraining;
use eTraining;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL auto_increment,
  `pass_word` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB auto_increment=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `course` (
  `course_id` int(11) NOT NULL auto_increment,
  `amount` bigint(20) DEFAULT NULL,
  `author_name` varchar(255) DEFAULT NULL,
  `course_duration` int(11) DEFAULT NULL,
  `course_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB auto_increment=101 CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `enrollment` (
  `enroll_id` int(11) NOT NULL auto_increment,
  `author_name` varchar(255) DEFAULT NULL,
  `course_duration` int(11) DEFAULT NULL,
  `course_name` varchar(255) DEFAULT NULL,
  `enroll_date` datetime(6) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`enroll_id`)
) ENGINE=InnoDB auto_increment=1001 CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

select *from course;
select *from enrollment;
select *from user;
insert into user values(user_id,"keerthi","Sri");

drop table user;
drop table course;
drop table enrollment;