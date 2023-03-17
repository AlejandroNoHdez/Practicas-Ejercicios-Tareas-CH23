-- IN
SELECT * FROM employee
WHERE employee_id IN (1, 3, 7, 8, 5);

-- BETWEEN
SELECT * FROM employee
WHERE salary BETWEEN 200000 and 500000;

-- BETWEEN NOT
SELECT * FROM employee
WHERE salary NOT BETWEEN 20000 and 50000;

-- LIMIT
SELECT * FROM employee
LIMIT 5;

-- LIMIT + OFFSET
SELECT * FROM employee
LIMIT 3 OFFSET 3;

-- LIKE
SELECT * FROM employee
WHERE last_name LIKE 'B%';

SELECT * FROM employee
WHERE last_name LIKE '%A';

-- CASE SENSITIVE
SELECT * FROM employee
WHERE last_name LIKE BINARY '%A';

-- LIKE ++
SELECT * FROM employee
WHERE join_date LIKE '%02%';

-- UPDATE INFO
UPDATE employee
SET salary = 300000
WHERE employee_id = 5;
SELECT * FROM employee ORDER BY department;

-- PRACTICA EN EQUIPO
UPDATE employee
SET salary = 8000
WHERE employee_id IN (1, 3);

UPDATE employee
SET salary = 12000
WHERE employee_id IN (2,5,8,4);

UPDATE employee
SET salary = 6000
WHERE employee_id IN (7,6);

INSERT INTO employee (first_name, last_name, salary,join_date,department)
VALUES ('Alejandro', 'Hernandez', 50000,"2023-03-17","Programador Sr");

SELECT * FROM employee;

-- MIN
SELECT MIN(salary) FROM employee;
SELECT MIN(last_name) FROM employee;

-- MAX
SELECT MAX(salary) FROM employee;

-- AVG
SELECT AVG(salary) FROM employee;
SELECT AVG(last_name) FROM employee;

-- SUM
SELECT SUM(employee_id) FROM employee;
SELECT SUM(salary), AVG(salary) FROM employee;

-- COUNT
SELECT COUNT(employee_id) FROM employee;
SELECT COUNT(salary) FROM employee;
SELECT COUNT(DISTINCT(salary)) FROM employee;