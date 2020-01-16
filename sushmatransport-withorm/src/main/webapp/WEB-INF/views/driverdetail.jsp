<%@page import="com.seer.DriverData"%>
<%@page isELIgnored="false" %>

<% DriverData driver=(DriverData)request.getAttribute("driverdata"); %>
<html>
<head>
</head>
<body>
<h2>Driver Detail</h2>
<table>
<tr><td>Driver Code:</td><td><%=driver.getDrivercode() %></td></tr>
<tr><td>Driver Name:</td><td><%=driver.getName() %></td></tr>
<tr><td>Address     :</td><td><%=driver.getAddress() %></td></tr>
<tr><td>Contact    :</td><td><%=driver.getContact() %></td></tr>
</table>
<hr>
<a href="index.jsp">Home</a>
<hr>
</body>
</html>