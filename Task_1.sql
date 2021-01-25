create table courses(id integer, name varchar(100), teacher_id integer);
insert into courses(id, name, teacher_id) values(1, "English Grammar", 3);
insert into courses(id, name, teacher_id) values(2, " Mathematics", 1);
insert into courses(id, name, teacher_id) values(3, " Physics", 4);
insert into courses(id, name, teacher_id) values(4, " Chemistry", 4);
insert into courses(id, name, teacher_id) values(5, " Biology", 5);
select * from courses;
-- Your code here!
SELECT name
  FROM courses
 WHERE teacher_id IN ('3', '1', '4','4','5')


create table teachers(id integer, name varchar(100));
insert into teachers(id, name) values(1, "Johanna Kabir");
insert into teachers(id, name) values(2, "Lara Gilbert");
insert into teachers(id, name) values(3, "John Smith");
insert into teachers(id, name) values(4, "Danniel Robertson");
insert into teachers(id, name) values(5, "Larry Cooper");
select * from teachers;
SELECT name
FROM teachers
WHERE name IN ('Johanna Kabir','Lara Gilbert','John Smith','Danniel Robertson','Larry Cooper')

create table courses(id integer, name varchar(100), teacher_id integer);
insert into courses(id, name, teacher_id) values(1, "English Grammar", 3);
insert into courses(id, name, teacher_id) values(2, " Mathematics", 1);
insert into courses(id, name, teacher_id) values(3, " Physics", 4);
insert into courses(id, name, teacher_id) values(4, " Chemistry", 4);
insert into courses(id, name, teacher_id) values(5, " Biology", 5);
select * from courses;
create table teachers(id integer, name varchar(100));
insert into teachers(id, name) values(1, "Johanna Kabir");
insert into teachers(id, name) values(2, "Lara Gilbert");
insert into teachers(id, name) values(3, "John Smith");
insert into teachers(id, name) values(4, "Danniel Robertson");
insert into teachers(id, name) values(5, "Larry Cooper");
select * from teachers;
SELECT courses.*, teachers.id as id
from courses
INNER JOIN teachers ON courses.id=teachers.id

SELECT MAX (mycount)
FROM (SELECT id,COUNT(id) AS mycount FROM courses 
GROUP BY teachers_id);
select * from course join teacher 
on course.teacher_id=teacher.teacher_id
where teacher.teacher_id not in 
(select distinct teacher_id WHERE course = NULL)

