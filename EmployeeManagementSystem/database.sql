CREATE DATABASE employeedb;

USE employeedb;

CREATE TABLE login(
    username VARCHAR(50),
    password VARCHAR(50)
);

INSERT INTO login VALUES('admin','admin123');

CREATE TABLE employee(
    id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(100),
    salary DOUBLE
);
