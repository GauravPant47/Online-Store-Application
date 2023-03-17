DROP TABLE IF EXISTS `product`;


CREATE TABLE `product`(
`product_id` int AUTO_INCREMENT PRIMARY KEY,
`customer_id` int NOT NULL,
`product_name`varchar(50) NOT NULL,
`product_type` varchar(50) NOT NULL,
`priduct_prise` varchar(15) NOT NULL,
`contry_origin` varchar(15) NOT NULL,
`product_description` varchar(255) NOT NULL
);



INSERT INTO `product`(`customer_id`,`product_name`,`product_type`,`priduct_prise`,`contry_origin`,`product_description`)
VALUES(1,'Samsung A3','Mobile','25000','china','This is a smore mobile generate by samsung');

INSERT INTO `product`(`customer_id`,`product_name`,`product_type`,`priduct_prise`,`contry_origin`,`product_description`)
VALUES(2,'Samsung s24','Mobile','150000','india','This is a smore mobile generate by samsung');

INSERT INTO `product`(`customer_id`,`product_name`,`product_type`,`priduct_prise`,`contry_origin`,`product_description`)
VALUES(3,'Motorola g8+','Mobile','15000','china','This is a smore mobile generate by Motorola');