-- INNER JOIN
-- t.students t.countries

SELECT * FROM students;
SELECT * FROM countries;
SELECT * FROM idtypes;
SELECT * FROM courses_has_students;
SELECT * FROM courses;
SELECT * FROM modules;

-- Encontrar a que paises perteneces
SELECT students.idStudent as 'ID',
	students.name AS 'Nombre',
    students.last_name AS 'Apellido',
	countries.name AS 'País de origen',
    countries.code AS 'Código del país'
FROM students
INNER JOIN countries
ON students.nationality = countries.idCountries;

-- Encontrar que tipo de ID tiene la raza
SELECT students.idStudent as 'ID',
	students.name AS 'Nombre',
    students.last_name AS 'Apellido',
	idtypes.name AS 'Tipo de ID de registro'
FROM students
INNER JOIN idtypes
ON students.IdType_id = idtypes.id_idTypes;

-- Abreviaciones
SELECT 
    t1.name,
    t2.name,
    t2.code
FROM
students t1
INNER JOIN countries t2
ON t1.nationality = t2.idCountries;

-- Buscar estudiantes y el curso al que pertenecen
SELECT 
    t1.name AS 'Nombre',
    t1.last_name AS 'Apellido',
    t2.course_code AS 'Codigo de curso',
    t3.name AS 'Curso',
    t3.credits
FROM students t1
INNER JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
INNER JOIN courses t3
ON t2.course_code = t3.code;

SELECT 
t1.course_code AS 'Codigo de curso',
t2.code AS 'Codigo de curso',
t2.name AS 'Curso'
FROM courses_has_students t1
INNER JOIN courses t2
ON t1.course_code = t2.code
GROUP BY t2.code;

-- Encontrar estudiantes que sean del pais 125
SELECT * FROM students
WHERE nationality = 125;

-- Contar estudiantes que pertenezcan al curso JAVA-1
SELECT COUNT(*) AS 'Numero de estudiantes' 
FROM courses_has_students 
WHERE course_code = 'JAVA-1';

-- Contar estudiantes por cada modulo
SELECT modules.code AS 'Codigo de modulo', COUNT(*) 
AS 'Numero de estudiantes'
FROM modules
INNER JOIN courses
ON modules.code = courses.module_code
INNER JOIN courses_has_students
ON courses.code = courses_has_students.course_code
GROUP BY modules.code;
  
-- Encontrar estudiantes SIN curso = 150
SELECT COUNT(*)
FROM students
WHERE idStudent NOT IN
(SELECT students_id_student FROM courses_has_students);

-- Comprobacion
-- Encontrar students no repetidos = 191
SELECT COUNT(DISTINCT idStudent) FROM students;

-- Encontrar idstudents no repetidos en courses_has_studens = 41
SELECT COUNT(DISTINCT students_id_student) FROM courses_has_students;

-- 191 - 41 = 150