<!DOCTYPE html>
<%@page import="entities.Film"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
  rel="stylesheet"
  href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css"
>
</head>
<body>

	<div class="container">
	
		<h1>Top 250 film</h1>
	
	
		<table>
		  <tr>
		    <th>Title</th>
		    <th>Year</th>
		    <th>Rating</th>
		  </tr>
		<!-- si devono ripetere foreach film nella lista -->
		<% List<Film> lista = (List<Film>) request.getAttribute("elenco"); %>
		
		<% for(Film f : lista){ %>
		
		  <tr>
		    <td><a target="_blank" href="https://www.google.com/search?q=<%= f.getTitle() %>"><%= f.getTitle() %></a></td>
		    <td><%= f.getYear() %></td>
		    <td><%= f.getRating() %></td>
		  </tr>
		
		<% } %>  
		  
		<!-- si devono ripetere foreach film nella lista -->
		</table>

	
	
	</div>



</body>
</html>