USE TEMP;
CREATE TABLE Customer(
	id integer PRIMARY KEY, 
    Cname varchar(225), 
    Address varchar(225),
    Gender varchar(2),
    City varchar(225),
    Pincode integer
);
insert INTO Customer
VALUES(1251,'BHARAT' , 'DEORIA' , 'M', 'UP', 274603),
(1252,'ROHTI' , 'PUNE' , 'M', 'MAHARASTRA', 20000),
(1253,'ANKIT' , 'INDORE' , 'M', 'MP', 274400),
(1254,'SURYA' , 'ANDHRA' , 'F', 'MADRAS', 345000),
(1255,'HARINI' , 'KERALA' , 'F', 'GWALIOR', 348007);

SELECT * FROM Customer;
CREATE TABLE Order_details (
	ORDER_ID integer primary KEY,
    Delivery_date DATE,
    cust_id INT,
    FOREIGN KEY(cust_id) references Customer(id)
);

ALTER TABLE ORDER_DETAILS;
DROP TABLE ORDER_DETAILS;
insert into order_details
VALUES(1, '2022-12-29' , 1254);

delete FROM Customer where id = 1254;

CREATE TABLE account(
		id int primary key, 
        name varchar(255) UNIQUE,
		balance INT,
        constraint acc_balance_chk CHECK(balance > 1000)
);

INSERT INTO account(id, name , balance)
VALUES(1, 'BHARAT' , 1000000);

INSERT INTO account(id, name , balance)
VALUES(2, 'AMIT' , 2000000);
SELECT * FROM ACCOUNT;

-- ADD NEW COLUMN
ALTER TABLE Account ADD interest FLOAT NOT NULL DEFAULT 0;
select * from account;

-- modify datatype
ALTER TABLE Account MODIFY Interest DOUBLE NOT NULL DEFAULT 0;

DESC account_details;

-- RENAME THE COLUMN 
ALTER TABLE Account CHANGE COLUMN Interest saving_interest FLOAT NOT NULL DEFAULT 0;

-- DROP COLUMN 
ALTER TABLE account DROP COLUMN saving_interest;

-- rename the table 
ALTER TABLE Account RENAME To account_details
