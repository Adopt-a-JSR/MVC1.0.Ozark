<%@page contentType="text/html" language="java" pageEncoding="UTF-8" %>
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

            <input type="text" name="id" value="${person.id}" hidden="true">
            <input type="text" name="jugs" value="${person.jugs}" hidden="true"><br/><br/>
            Name:<input type="text" name="name" value="${person.name }"><br/><br/>
            Age: <input type="number" name="age" value="${person.age }"/><br/> <br/>
            Country:<input type="text" name="country" value="${person.address.country}"><br/><br/>
            State:<input type="text" name="state" value="${person.address.state}"><br/><br/>

            <textarea rows="10" cols="30" name="description">${person.description}</textarea>
            <br/><br/>

            <input type="submit" value="Save">
        </fieldset>
    </form>
</div>
</body>
</html>