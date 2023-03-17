DROP TABLE IF EXISTS `customer`;
DROP TABLE IF EXISTS `product`;

CREATE TABLE `customer`(
`customer_id` int AUTO_INCREMENT PRIMARY KEY,
`name` varchar(30) NOT NULL,
`email_id` varchar(20) NOT NULL,
`dob` date NOT NULL,
`mobile_number` varchar(15) NOT NULL,
`customer_address` varchar(255) NOT NULL
);

CREATE TABLE `product`(
`product_id` int AUTO_INCREMENT PRIMARY KEY,
`product_name`varchar(50) NOT NULL,
`product_type` varchar(50) NOT NULL,
`priduct_prise` varchar(15) NOT NULL,
`contry_origin` varchar(15) NOT NULL,
`product_description` varchar(15) NOT NULL
);

INSERT INTO `customer`(`name`,`email_id`,`dob`,`mobile_number`,`customer_adderss`)
VALUES('Nikhil','nikhil@yahoo.com','1998-02-13','9568947592','rohini R.No-12 h2');

INSERT INTO `customer`(`name`,`email_id`,`dob`,`mobile_number`,`customer_adderss`)
VALUES('Rohan','rohan@yahoo.com','1990-02-25','9568965894','sector 24 R.No-34 h35');

INSERT INTO `customer`(`name`,`email_id`,`dob`,`mobile_number`,`customer_adderss`)
VALUES('Dipika','dipika@yahoo.com','2003-02-06','9568965785','rajput rood H.No-5 G.No-18');


INSERT INTO `product`(`product_name`,`product_type`,`priduct_prise`,`contry_origin`,`product_description`)
VALUES('Samsung A3','Mobile','25000','china','This is a smore mobile generate by samsung');

INSERT INTO `product`(`product_name`,`product_type`,`priduct_prise`,`contry_origin`,`product_description`)
VALUES('Samsung s24','Mobile','150000','india','This is a smore mobile generate by samsung');

INSERT INTO `product`(`product_name`,`product_type`,`priduct_prise`,`contry_origin`,`product_description`)
VALUES('Motorola g8+','Mobile','15000','china','This is a smore mobile generate by Motorola');