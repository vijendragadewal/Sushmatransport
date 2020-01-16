<%@page import="java.util.List,com.seer.DriverData" %>
<%
 List<DriverData> driverslist= (List<DriverData>)request.getAttribute("driverslist");

%>
<html>
<head>
</head>
<body>
<table>
<tr><th>DriverCode</th><th>DriverName</th><th>Address</th><th>DriverContact</th><th>Edit Record></th><th>Delete Record</th></tr>
	<% for(DriverData driver:driverslist) 
		{
		%>
	<tr>
	<td><%=driver.getDrivercode() %></td>
	<td><%=driver.getName() %></td>
	<td><%=driver.getAddress()%></td>
	<td><%=driver.getContact()%></td>
	</tr>
	<% } %>
</table>
</body>
</html>