create table new_application(
 name varchar(40),
 mob varchar(40),
 addr varchar(40),
 gender varchar(40),
 dob varchar(40),
 amount varchar(40),
 no_of_year varchar(40),
 loan_type varchar(40),
 username varchar(40),
 password varchar(20),
 status varchar(20),
 primary key(username,password)
 
 
);

-- ---------------------------------------------------------------

select *
from new_application;