<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>acceso</title>
<link rel="stylesheet" href="css/login.css">
</head>
<body>
			<h2>Acceso</h2>
		<form action="login" method="post">
			Nombre: <input type="text" class="form-control" name="username"/>
			<br/>
			Contraseña: <input type="password" class="form-control" name="password"/>
			<br/><br/>
			<input type="submit" value="Acceder">
		</form>
</body>
</html>