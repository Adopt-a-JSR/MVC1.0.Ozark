<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert</title>
</head>
<body>
  <div align="center">
 <form action="add" method="post">

<fieldset style="width: 400px">
   <legend>Data</legend>

	 Name: <input type="text" name="name" /><br /><br />
    Age: <input type="number" name="age"/><br /> <br />
    Country: <input type="text" name="country"/><br /><br />
   State: <input type="text" name="state"/><br /><br />
   JUGS:<input type="radio" name="jugs" value="SouJava"/>SouJava
   <input type="radio" name="jugs" value="RioJug"/>RioJug
   <input type="radio" name="jugs" value="SouJava Campinas"/>SouJava Campinas<br /><br />
   
   <textarea rows="10" cols="30" name="description">Description</textarea> 
   <br/><br />
  
   <input type="submit" value="Register Data"/>
   
</fieldset>
  </form>
  </div>
</body>
</html>