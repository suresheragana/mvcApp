<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome to home page</title>
</head>
<body>

<!-- 	<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
 -->	
 
 <img alt="image" src="/files12.png"/>
 <script src="<c:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
	<script type="text/javascript">
	
	
		function checkname(){
		var name=$("#aname").val();
		alert(name);
		$.ajax({
			url:'checkname',
			data:'input='+name,
			success:function(message){
				$("#namearea").html(message);
				$("#namearea").css('color','red');
				
			}
		});
	}
</script>

<script type="text/javascript">

function checkid(){
	var eid=$("#eid").val();
	alert(eid+"eid is going to verify");
	$.ajax({
		url:'checkeid',
		data:'input='+eid,
		success:function(message){
			$("#idarea").html(message);
		}
	});
}
</script>

	<form action="insert" method="post" enctype="multipart/form-data">
	
	<table>
	<tr><td>id</td>
	<td><input type="text" onchange="checkid();" id="eid" name="eid"><div id="idarea"></div></td></tr>
	<tr>
		<td>name</td>
		<td><input type="text" name="ename" id="aname" onchange="checkname();" required><div id="namearea"></div></td>
	</tr>
	
		<tr>
		<td>photo</td>
		<td><input type="file" name="file" required><div id="image1area"></div></td>
	</tr>
	
	<tr><td><input type="submit" value="insert"></td></tr>
	</table>
	
	</form>
	<c:if test="${!empty emp}">
		<c:out value="${emp.fname}"/>
	</c:if>
	<c:if test="${!empty name}">
	<c:out value="${name}"/>
	</c:if>
	
</body>
</html>