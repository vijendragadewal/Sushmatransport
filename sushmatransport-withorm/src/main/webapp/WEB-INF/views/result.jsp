<%@page import="com.seer.DriverData"%>
<html>
<%
 DriverData drv=(DriverData)request.getAttribute("driver");
%>
<body>
			<h3> Successfully Entered Detail</h3>
			<h4> You have Enter Detail</h4>
			<pre>
			Driver Code  : <%=drv.getDrivercode() %>
			Name         : <%=drv.getName() %>
			Address      : <%=drv.getAddress() %>
			Contact      : <%=drv.getContact() %>
		
		    <a href="index.jsp">Home</a>
		    <a href="inputpage">Add some more</a>
			</pre>
</body>
</html>