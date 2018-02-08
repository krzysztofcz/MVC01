package pl.coderslab.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mvc01
 */
@WebServlet( urlPatterns="/Mvc01", 
			 initParams= {
				@WebInitParam(name="exchangeRate", value="4.20", description="Exchange rate for Euro")
			}
)
public class Mvc01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mvc01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			double value = Double.parseDouble(request.getParameter("value"));
			
			double rate = Double.parseDouble(getInitParameter("exchangeRate"));
			double result = value / rate;
			
			request.setAttribute("result", result);
			request.setAttribute("rate", rate);
			
			
			getServletContext().getRequestDispatcher("/WEB-INF/views/mvc01.jsp")
				.forward(request, response);
			
		}catch (Exception e) {
			response.getWriter().append(e.getMessage())
								.append("Wrong value ")
								.append(request.getParameter("value"));
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}