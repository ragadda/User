DROP TABLE IF EXISTS userr;

CREATE TABLE userr(
    id int NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL DEFAULT '',
    last_name VARCHAR(255) NOT NULL DEFAULT '',
    email VARCHAR(255) NOT NULL DEFAULT '',
    age int NOT NULL DEFAULT 0,
    address VARCHAR(255) NOT NULL DEFAULT '',
    joining_date DATE NOT NULL DEFAULT now() ,
    PRIMARY KEY(id)
);

INSERT INTO userr (first_name,last_name,email,address,age)
VALUES ('A','a','aaa@mail.com','aa',20),
       ('B','b','bbb@mail.com','bb',20),
       ('C','c','ccc@mail.com','cc',18),
       ('D','d','ddd@mail.com','dd',19);