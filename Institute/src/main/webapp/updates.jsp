<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
<form action="update" method="post">
<div class="mb-3">
<label class="form-label">Name</label>
<input type="text" class="form-control"name="name">
</div>
<div class="mb-3">
<label class="form-label">Address</label>
<input type="text" class="form-control"name="address">
</div>
<div class="mb-3">
<label class="form-label">Email</label>
<input type="text" class="form-control"name="email">
</div>
<input type="submit" value="update">
</form>
</body>
</html>