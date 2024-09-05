<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<style>
ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: lightblue;
}

li 
{
  float: left;
  border-right: 1px solid blue;
}

li a 
{
  display: block;
  color: black;
  font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: black;
color: white;
}
li a:hover {
  background-color: orange;
  color: white;
}
body {
  background-image: url('images/adminhome.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
 }
</style>
</head>
<body>

<h1 align=center>COURSE MANAGEMENT SYSTEM</h1>

<br>

<ul>
  <li><a class="active" href="adminhome">Home</a></li>
  <li><a href="addfaculty">Add Faculty</a>
  <li><a href="viewallfaculty">View All Faculty</a></li>
  <li><a href="addstudent">Add Student</a>
  <li><a href="viewallstudents">View All Students</a></li>
   <li><a href="addcourse">Add Course</a>
   <li><a href="viewallcourses">View All Courses</a></li>
  <li style="float:right"><a href="adminlogin">Logout</a></li>
</ul>

<br>

<h3 align=right>Welcome&nbsp;<c:out value="${auname}"></c:out></h3>

</body>
</html>

 
