<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

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
  background-color: lightgreen;
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
</style>
</head>
<body>

<h1 align=center>Course Management System</h1>

<br>

<ul>
  <li><a href="adminhome">Home</a></li>
  <li><a href="addfaculty">Add Faculty</a>
  <li><a class="active"  href="viewallfaculty">View All Faculty</a></li>
  <li><a href="adminlogin">Logout</a></li>
</ul>

<br><br>

<h3 align=center><u>View All Fcaulty</u></h3>

<table align=center border=2>

<tr>

<th>ID</th>
<th>Name</th>
<th>Gender</th>
<th>Department</th>
<th>Designation</th>
<th>Username</th>
<th>Contact No</th>
<th>Action</th>

</tr>

<c:forEach items="${faclist}" var="fac">

<tr>

<td> <c:out value="${fac.id}"></c:out>   </td>
<td> <c:out value="${fac.name}"></c:out>   </td>
<td> <c:out value="${fac.gender}"></c:out>   </td>
<td> <c:out value="${fac.department}"></c:out>   </td>
<td> <c:out value="${fac.designation}"></c:out>   </td>
<td> <c:out value="${fac.username}"></c:out>   </td>
<td> <c:out value="${fac.contactno}"></c:out>   </td>
<td> 

<a href='<c:url value='deletefac?id=${fac.id}'></c:url>'>Delete</a>&nbsp;&nbsp;
<a href='<c:url value='viewfacbyid?id=${fac.id}'></c:url>'>View</a>&nbsp;&nbsp;

</td>


</tr>

</c:forEach>

</table>

</body>
</html>

 
