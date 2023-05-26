# 4
ALTER TABLE ChooseBb ADD (Bb4 VARCHAR(20) DEFAULT '系统测试值' NOT NULL);

# 5
ALTER TABLE ChooseBb ADD (Bb5 VARCHAR(10)), ADD PRIMARY KEY(Bb5);

# 6
CREATE VIEW  View_Choosebb
AS SELECT Bb1 View_bb1 , Bb4 View_bb2, Bb5 View_bb3 FROM ChooseBb;

# 7
DROP VIEW View_Choosebb;

# 8
CREATE INDEX index_bb2 on ChooseBb(Bb2) ASC;
CREATE INDEX index_bb4 on ChooseBb(Bb4) DESC;

# 9
DROP INDEX index_bb2 on ChooseBb;

# 10


# 11
INSERT into test VALUES('');

# 12

# 13
INSERT INTO test_temp VALUES('',,,'');

# 14
INSERT INTO test FROM
SELECT * FROM test_temp;

# 15
UPDATE test SET score = score + 5 where age<=20;

# 16
UPDATE test SET age = age - 1 where address LIKE '南福苑%';

# 17
DELETE FROM test where age >= 21 and score >= 500;

# 18
DELETE FROM test where score <500 and address LIKE '重邮宿舍%';

# 19

# 20

# 21

# 22
INSERT INTO student VALUES();

# 23
insert into course VALUES();

# 24
insert into choose VALUES();

# 25
SELECT SNO,`name` FROM
    student
where college = '计算机学院';

# 26
select * from student
where age BETWEEN 20 and 23;

# 27
SELECT count(*) from student;

# 28
SELECT MAX(score) from Choose, course
where coursename = 'C1' and choose.CourseID = course.CourseID;
SELECT MIN(score) from Choose, course
where coursename = 'C1' and choose.CourseID = course.CourseID;
SELECT SUM(score) from Choose, course
where coursename = 'C1' and choose.CourseID = course.CourseID;
SELECT AVG(score) from Choose, course
where coursename = 'C1' and choose.CourseID = course.CourseID;

# 29
SELECT courseid, coursename from course
where coursebeforeid is null;

# 30
SELECT sno, `name`, coursename, score
from choose, student, course
where choose.SNO = student.SNO, course.CourseID = choose.CourseID;

# 31
select *
from student
where exists(
    select college
    from student
    where `name` = '张三');

# 32
select sno, score
from student, course
where score < (
    SELECT score from course
    where `name` = '张三'
);

# 33
select sno FROM
               student, course, choose
where coursename = 'C1'
  and student.SNO = choose.SNO, choose.CourseID = course.CourseID
UNION
select sno FROM
               student, course, choose
where coursename = 'C3'
  and student.SNO = choose.SNO, choose.CourseID = course.CourseID;

# 34
select sno FROM
               student, course, choose
where coursename = 'C1'
  and student.SNO = choose.SNO, choose.CourseID = course.CourseID
UNION DISTINCT
select sno FROM
               student, course, choose
where coursename = 'C3'
  and student.SNO = choose.SNO, choose.CourseID = course.CourseID;




