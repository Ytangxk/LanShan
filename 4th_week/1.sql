

create table employees(
emp_no  int,
birth_date  date,
first_name   varchar(32),
last_name  varchar(32),
gender  char(1),
hire_date   date
)
insert into employees(
emp_no,
birth_date ,
first_name,
last_name,
gender,
hire_date
)  values(
10002,'1964-06-02','Bezalel','Simmel','F ','1985-11-21' 
); 
insert into employees(
emp_no,
birth_date ,
first_name,
last_name,
gender,
hire_date
) values(
10003,'1959-12-03','Parto','Bamford','M','1986-08-28'
);
insert into employees(
emp_no,
birth_date ,
first_name,
last_name,
gender,
hire_date
)values(
 10004,'1954-05-01','Christian','Koblick','M','1986-12-01'
);
select * from employees order by hire_date desc limit 0,1 ;
