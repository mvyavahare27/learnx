<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.cg.dao.EmployeeDao" %>
<%@ page import="com.cg.entity.Employee" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display data</title>
</head>
<body>
${showData}
<%Employee emp = new Employee(); %>
<a href="/SpringMVCLearn/mvc/del?id=<%=1%>">delete</a>


${deleteMsg}

<%-- <% 
	EmployeeDao employeeDao = new EmployeeDao();
	List<Employee> mylist = new ArrayList<Employee>();

	mylist = employeeDao.employeeList();
	%>
	<% 
	for(Employee emp : mylist)
	{%>

		<% %>
		<table>
			<thead>
				<tr>
					<th>S.No.</th>
					<th>Name:</th>
					<th>Age:</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td></td>
					<td><%emp.getId();%></td>
					<td><%emp.getAge(); %></td>
					
				</tr>
			</tbody>
		</table>
		
		
<%}%>
 --%>



</body>
</html>