<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet" href="jquery.rating.css">
<script src="jquery.js"></script>
<script src="jquery.rating.js"></script>
</head>
<body>
	<h3>WELCOME PAGE</h3>
	<a href="${contextPath}/BookShop/homePage"> TO USER PAGE </a>
	<form>
            <input type="radio" name="rating" value="1" class="star">
            <input type="radio" name="rating" value="2" class="star">
            <input type="radio" name="rating" value="3" class="star">
            <input type="radio" name="rating" value="4" class="star">
            <input type="radio" name="rating" value="5" class="star">
        </form>
</body>
</html>
