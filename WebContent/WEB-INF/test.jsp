<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${empty ok}">

<form action="zero" method="get">
<input type="number" id="a" name="a">
<input type="number" id="b" name="b"> 
<input type="submit" value="ok" name="ok">

</form>
</c:if>
<c:if test="${! empty ok }" >

  ${somme}
 </c:if>
</body>
</html>