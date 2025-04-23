
<%@page import="model.Pokemon"%>
<%@page import="java.util.List"%>
<%@page import="service.PokemonService"%>
<%
	PokemonService service = new PokemonService();
	
	List<Pokemon> lista =  service.getAllPokemon();
	


%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
	
		<h1>Pokemon</h1>
	
	<% 
	for (Pokemon pokemon : lista) {
		out.println( "<h2>" + pokemon.getNome() + "</h2>" );
	}
	%>
	
		
	
	</div>

</body>
</html>