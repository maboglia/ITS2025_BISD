<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>La mia prima pagina java web</h1>

	<%
		String s = "Tranquilli! E' finita!";
		out.print("<h2>" + s + "</h2>" );
	%>

	<h3><%= s %></h3>

</body>
</html>