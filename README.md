# Loan-Management-System-Using-MYSQL-and-Java-GUI

RUN PROCESS:

First You should connect your java ide with JDBC(Java Database Connectivity) Here the full reference of How to connect JDBC with MY SQL https://www.javatpoint.com/example-to-connect-to-the-mysql-database

2.you should create a database with name of "project" 
3. create a table "new_application " in project database;

In the code you should change this line of code with this

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/project","root","ambesh");

 *where you change root with your username and ambesh with password of you MYSQL .

  By default username is already root.

 # you should run ex.java file
OUTPUT :

   
   
   # 1  After run you get 4 buttons:
   
![4_buttons](https://user-images.githubusercontent.com/48892208/85872981-20e1f480-b7ee-11ea-863e-3c8336d6ff7e.png)

# if click   new Customer   first you  get registration form :
![regist](https://user-images.githubusercontent.com/48892208/85873588-f7759880-b7ee-11ea-9643-2f826f587ff3.png)

# after register you can login as exist customer  by using username and password can see all details of his and staus of application also :
![login](https://user-images.githubusercontent.com/48892208/85874048-aa45f680-b7ef-11ea-8551-372e59cba96d.png)
![regist](https://user-images.githubusercontent.com/48892208/85874060-ae721400-b7ef-11ea-986a-e270c383f705.png)

# admin can login  then after admin have 3 option  and he can application status update as passed or rejected or otherwise no action show pending application :

![admin](https://user-images.githubusercontent.com/48892208/85874546-6c959d80-b7f0-11ea-9471-0a7212af45ea.png)
![buttonadmin](https://user-images.githubusercontent.com/48892208/85874550-6e5f6100-b7f0-11ea-8510-7fb430608202.png)





