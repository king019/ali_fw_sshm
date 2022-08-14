create schema ds0;
create schema ds1;

CREATE TABLE `ds0`.`t_order` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` varchar(256) NOT NULL,
  `order_id` varchar(256) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `ds1`.`t_order` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` varchar(256) NOT NULL,
  `order_id` varchar(256) NOT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE `ds1`.`t_order` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `order_id` INT NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `ds0`.`t_order0` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `order_id` INT NOT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE `ds0`.`t_order1` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `order_id` INT NOT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE `ds1`.`t_order0` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `order_id` INT NOT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE `ds1`.`t_order1` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `order_id` INT NOT NULL,
  PRIMARY KEY (`id`)
);

--#############
CREATE TABLE `ds0`.`t_order_item0` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `order_id` INT NOT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE `ds0`.`t_order_item1` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `order_id` INT NOT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE `ds1`.`t_order_item0` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `order_id` INT NOT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE `ds1`.`t_order_item1` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `order_id` INT NOT NULL,
  PRIMARY KEY (`id`)
);





