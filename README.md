# ToDoApp-spring-mvc-

#I Used Java 17 in This Project
#Pom.xml

#create DataBase in mysql version 8 
create database todoApp;
create table todoData(id int primary key auto_increment,todoTitle varchar(50) unique,todoContent varchar(100));
select *from todoData;


#In todo-servlet.xml
<property name="password" value=""/>

give your password
