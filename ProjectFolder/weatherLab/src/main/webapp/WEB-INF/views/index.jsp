<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WEATHER</title>
</head>
<body>
<h1>WEATHER HERE</h1>
<p>Please enter a latitude and longitude, otherwise it will default to Detroit.</p>

<form action="/locationSelect" method="POST">
		Latitude: <input type="number" step="0.001" value="42.41" name="latitude"/><br>
		Longitude: <input type="number" step="0.001" value="-83.01" name="longitude"/><br>
		<input type="submit"/>
</form>
</body>
</html>