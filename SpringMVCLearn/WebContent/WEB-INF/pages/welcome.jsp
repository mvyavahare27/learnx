<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello Page</title>
</head>
<body>
<h1>Welcome to spring mvc pattern</h1>
${welcome}

<br>
${welcomeMsg}
<br/>
${pathMsg}
<br>
${email}
<a href="email?email=<%="M@gmail.com"%>" name="email">Click here</a>
<h1>Employee Records</h1>
<c:if test="${not empty lists}">
    <c:forEach items="${lists}" var="lists">
       
       <form>
       	<table border="1">
       			<thead>
       				<tr>
       				<th>Name</th>
       				<th>Age</th>
       				<th>Edit</th>
       				<th>Delete</th>
       				</tr>
       			</thead>
       			<tbody>
       				<tr>
       					<td>${lists.getName()}</td>
       					<td>${lists.getAge()}</td>
       					<td><a href='EditCustomer.jsp?id=${lists.getId()}'>edit</a></td>
       					<td><a href='/SpringMVCLearn/mvc/del?id=${lists.getId()}'>delete</a></td>
       				</tr>
       			</tbody>	
       		
       	</table>
       </form>
</c:forEach>
</c:if>
</body>
</html>