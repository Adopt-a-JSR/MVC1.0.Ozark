<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update data</title>
</head>
<body>
		<div align="center">
		<form action="../update" method="post">
		<fieldset style="width: 400px">
            <legend>Change of Data</legend>
   
		<input type="text" name="_id" value="${update._id }" hidden="true"><br/><br />
      Name:<input type="text" name="name" value="${update.name }"><br/><br /> 
      Age: <input type="number" name="age" value="${update.age }"/><br /> <br />
      State:<input type="text" name="address"  value="${update.address.state}"><br /><br/>
      <textarea rows="10" cols="30" name="description" disabled="disabled">${update.jugs.get(0).description}</textarea>
      <br /><br />
      
      <input type="submit" value="Update Data">
      </fieldset>
  </form>
  </div>
</body>
</html>