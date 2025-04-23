package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.PokemonService;


@WebServlet("/public")
public class MVCController extends HttpServlet {

	private PokemonService service = new PokemonService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("listaPokemon", service.getAllPokemon());
		req.getRequestDispatcher("tabella.jsp").forward(req, resp);
		
	}
	
	
	
}
