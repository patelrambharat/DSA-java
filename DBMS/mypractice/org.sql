CREATE DATABASE ORG;
USE ORG;

CREATE TABLE Worker (
	WORKER_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	FIRST_NAME CHAR(25),
	LAST_NAME CHAR(25),
	SALARY INT(15),
	JOINING_DATE DATETIME,
	DEPARTMENT CHAR(25)
);

select * From Worker;
INSERT INTO Worker 
	(WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
		(001, 'Monika', 'Arora', 100000, '14-02-20 09.00.00', 'HR'),
		(002, 'Niharika', 'Verma', 80000, '14-06-11 09.00.00', 'Admin'),
		(003, 'Vishal', 'Singhal', 300000, '14-02-20 09.00.00', 'HR'),
		(004, 'Amitabh', 'Singh', 500000, '14-02-20 09.00.00', 'Admin'),
		(005, 'Vivek', 'Bhati', 500000, '14-06-11 09.00.00', 'Admin'),
		(006, 'Vipul', 'Diwan', 200000, '14-06-11 09.00.00', 'Account'),
		(007, 'Satish', 'Kumar', 75000, '14-01-20 09.00.00', 'Account'),
		(008, 'Geetika', 'Chauhan', 90000, '14-04-11 09.00.00', 'Admin');
        

CREATE TABLE Bonus (
	WORKER_REF_ID INT,
	BONUS_AMOUNT INT(10),
	BONUS_DATE DATETIME,
	FOREIGN KEY (WORKER_REF_ID)
		REFERENCES Worker(WORKER_ID)
        ON DELETE CASCADE
);
INSERT INTO Bonus 
	(WORKER_REF_ID, BONUS_AMOUNT, BONUS_DATE) VALUES
		(001, 5000, '16-02-20'),
		(002, 3000, '16-06-11'),
		(003, 4000, '16-02-20'),
		(001, 4500, '16-02-20'),
		(002, 3500, '16-06-11');

CREATE TABLE Title (
	WORKER_REF_ID INT,
	WORKER_TITLE CHAR(25),
	AFFECTED_FROM DATETIME,
	FOREIGN KEY (WORKER_REF_ID)
		REFERENCES Worker(WORKER_ID)
        ON DELETE CASCADE
);
select * From Title;
INSERT INTO Title 
	(WORKER_REF_ID, WORKER_TITLE, AFFECTED_FROM) VALUES
 (001, 'Manager', '2016-02-20 00:00:00'),
 (002, 'Executive', '2016-06-11 00:00:00'),
 (008, 'Executive', '2016-06-11 00:00:00'),
 (005, 'Manager', '2016-06-11 00:00:00'),
 (004, 'Asst. Manager', '2016-06-11 00:00:00'),
 (007, 'Executive', '2016-06-11 00:00:00'),
 (006, 'Lead', '2016-06-11 00:00:00'),
 (003, 'Lead', '2016-06-11 00:00:00');
 
 select * FROM Worker;
 
 select * From title;
 
 select * From Bonus;
        

        select FIRST_NAME From Worker;
SELECT NOW();

SELECT * FROM Worker WHERE Salary > 80000;
select * from Worker where Salary BETWEEN 80000 AND 300000;
SELECT * FROM Worker WHERE DEPARTMENT = 'HR';


-- --HR AND ADMIN ---
-- SELECT * FROM Worker WHERE DEPARTMENT = 'HR' OR DEPARTMENT = 'ADMIN' OR DEPARTMENT = 'Account';
-- better way
SELECT * FROM Worker WHERE DEPARTMENT IN ('HR', 'ADMIN' );  -- sare or ko remove kr diya
-- not
SELECT * FROM Worker WHERE DEPARTMENT NOT IN ('HR', 'ADMIN' );

-- wildcard
SELECT * FROM Worker WHERE first_name LIKE '_i%';

-- sorting using order by  	 ASC --> ------default value
SELECT * FROM Worker ORDER BY salary DESC;

-- Distinct values 
SELECT distinct Department FROM Worker;

-- data grouping find no of employee working in diff department 


-- average salary per department 
select DEPARTMENT , AVG(salary) from worker group by department;

-- find min salary
select DEPARTMENT , MIN(salary) from worker group by department;
-- FIND MAX SALARY
select DEPARTMENT , MAX(salary) from worker group by department;

-- PER DEPARTMENT TOTAL SALARY
select DEPARTMENT , SUM(salary) from worker group by department;

-- HAVING KEYWORD
-- GROUP BY KE ANDAR FILTERING APPLY KARNA HAI TO HAVING KA USE KARENGE
-- GROUP BY KE SATH HI AGGREGATION POSSIBLE HAI
SELECT DEPARTMENT , COUNT(department) from worker group by department having COUNT(DEPARTMENT) >2;
