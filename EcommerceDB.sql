create database eCommerce;
use eCommerce;

select *from store;
select *from product;
select *from user;
select *from store_product;
select *from store_review;

create table store_product 
(
store_product_id Integer auto_increment primary key,
store_id Integer,
product_id integer,
price Double,
foreign key(store_id) references store(store_id),
foreign key(product_id) references product(product_id)
) auto_increment=1;

create table store_review
(
review_id Integer primary key auto_increment,
store_id integer,
user_id integer,
rating float,
foreign key(store_id) references store(store_id),
foreign key(user_id) references user(user_id)
) auto_increment=1;
