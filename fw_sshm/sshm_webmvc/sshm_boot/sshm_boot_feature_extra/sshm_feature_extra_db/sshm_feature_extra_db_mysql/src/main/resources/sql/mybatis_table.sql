CREATE TABLE blog1
(
    id INT PRIMARY KEY AUTO_INCREMENT,
    sum_num INT DEFAULT 0 NOT NULL,
    blog_name varchar(1024) DEFAULT '' NOT NULL,
    blog_time DATETIME
);
ALTER TABLE blog1 COMMENT = 'blog1';


CREATE TABLE blog2
(
    id INT PRIMARY KEY AUTO_INCREMENT,
    sum_num INT DEFAULT 0 NOT NULL,
    blog_name varchar(128) DEFAULT '' NOT NULL,
    blog_time DATETIME
);
ALTER TABLE blog2 COMMENT = 'blog2';