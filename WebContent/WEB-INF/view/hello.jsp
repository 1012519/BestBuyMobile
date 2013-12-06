<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h3>Message : ${message}</h3>	
	<h3>Username : ${username}</h3>	
	
	<a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
	
	<%-- <table>
	<c:forEach var="item" items="listAccount" varStatus="status">
		<tr>
			<th>${status.index}</th>
			<th>${item.Name}</th>
		</tr>
	</c:forEach>
	</table> --%>
</body>
</html>
