package controller;

import java.io.IOException;
import java.util.List;

import entities.Frutto;
import entities.Prodotto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.OrtofruttaService;

/**
 * Servlet implementation class Frutta
 */
@WebServlet("/frutta")
public class Frutta extends HttpServlet {

	private OrtofruttaService service = new OrtofruttaService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Prodotto> frutta = service.getFrutta();
		
		System.out.println(frutta.size());
		
		response.setContentType("text/html");
		
		for (Prodotto frutto : frutta) {
			response
			.getWriter()
			.append(frutto.getNome() + "<br>");
		}
		
		
	}


}
