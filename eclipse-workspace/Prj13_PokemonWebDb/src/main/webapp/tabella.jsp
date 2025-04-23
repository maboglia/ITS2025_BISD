<%@ include file="header.jsp" %>

<%@page import="java.util.List"%>
<%@page import="model.Pokemon"%>
<% List<Pokemon> listaPokemon = (List<Pokemon>) request.getAttribute("listaPokemon"); %>
<table>
  <tr>
    <th>Nome</th>
    <th>Tipo 1</th>
  </tr>
<% for(Pokemon p: listaPokemon){ %>
  <tr>
    <td><%= p.getNome() %></td>
    <td><%= p.getTipo1() %></td>
  </tr>
<% } %>
</table>

<%@ include file="footer.jsp" %>