CREATE TABLE mybatis_table_1
(
    id1 INT PRIMARY KEY AUTO_INCREMENT,
    mybatis_id1 INT DEFAULT 0 NOT NULL,
    mybatis_name1 VARCHAR(50) DEFAULT 'mybatis_name1' NOT NULL
);
ALTER TABLE mybatis_table_1 COMMENT = 'mybatis测试1';
ALTER TABLE mybatis_table_1 ADD mybatis_time1 DATETIME DEFAULT now() NOT NULL;
CREATE TABLE mybatis_table_2
(
    id2 INT PRIMARY KEY AUTO_INCREMENT,
    mybatis_id2 INT DEFAULT 0 NOT NULL,
    mybatis_name2 VARCHAR(50) DEFAULT 'mybatis_name2' NOT NULL
);
ALTER TABLE mybatis_table_2 COMMENT = 'mybatis测试2';
ALTER TABLE mybatis_table_2 ADD mybatis_time2 DATETIME DEFAULT now() NOT NULL;