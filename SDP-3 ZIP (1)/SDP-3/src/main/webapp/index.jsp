<!DOCTYPE html>
<html>
<head>
<style>

* {
   box-sizing: border-box;
}
.imageColumn {
   float:left;
   align:middle;
   width: 20%;
   padding: 10px;
}
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
  color: Red;
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
h1 {
    text-align: center;
    color: black;
}

body {
  background-image: url('images/index.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
 }

</style>
</head>
<body >

<h1 align=center>COURSE MANAGEMENT SYSTEM</h1>

<br>

<ul>
  <li style="text-align: center"><a class="active" href="/">Home</a></li>
  <li><a href="adminlogin">Admin</a></li>
  <li><a href="facultylogin">Faculty</a></li>
  <li ><a href="studentlogin">Student</a></li>
</ul>

<br><br><br>
<div class="alignRow">
<div class="imageColumn">
<img src="images/Admin.png" alt="img1" width="100%" height="100%" style="vertical-align:middle;margin:50px 300px">
</div>
<div class="imageColumn">
<img src="images/Faculty.png" alt="img2" width="100%" height="100%" style="vertical-align:middle;margin:50px 300px">
</div>
<div class="imageColumn">
<img src="images/Student.png" alt="img3" width="100%" height="100%" style="vertical-align:middle;margin:50px 300px">
</div>
</div>

</body>
</html>

 
