package controller;

import java.io.IOException;
import java.util.List;

import org.json.JSONArray;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Pokemon;
import service.PokemonService;

@WebServlet("/api")
public class PokemonController extends HttpServlet{

	private PokemonService service = new PokemonService();

	@Override
	protected void doGet(HttpServletRequest richiesta, HttpServletResponse risposta) throws ServletException, IOException {

		risposta.setContentType("application/json");//Tipo MIME

		JSONArray array = new JSONArray(service.getAllPokemon());
		
		risposta.getWriter().print(array.toString());
		
		
		
	}
	
	
	
	
}
