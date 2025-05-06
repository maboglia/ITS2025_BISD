package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.FilmService;
import services.FilmServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import entities.Film;

/**
 * Servlet implementation class FilmMVC
 */
@WebServlet("/films")
public class FilmMVC extends HttpServlet {

	private FilmService service = new FilmServiceImpl();


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Film> lista = service.getFilms();
		request.setAttribute("elenco", lista);
		request.getRequestDispatcher("film.jsp").forward(request, response);
		
		
	}

}
