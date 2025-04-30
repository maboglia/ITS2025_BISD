package integration;

import java.io.IOException;

import org.json.JSONObject;

import entities.Automobile;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.AutomobileService;
import services.AutomobileServiceImpl;

/**
 * Servlet implementation class AutomobiliREST
 */
@WebServlet("/api")
public class AutomobiliREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private AutomobileService service;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutomobiliREST() {
        super();
        this.service = new AutomobileServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Automobile a = this.service.getAutomobili().get(0);
		
		JSONObject obj = new JSONObject(a);
		
		response.setContentType("application/json");
		response.getWriter().append(obj.toString());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
