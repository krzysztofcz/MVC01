package pl.coderslab.controller;

import java.io.IOException;
import pl.coderslab.controller.Book;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mvc03
 */
@WebServlet("/Mvc03")
public class Mvc03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mvc03() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			getServletContext().getRequestDispatcher("/WEB-INF/views/mvc03.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String title = request.getParameter("title");
			String author = request.getParameter("author");
			int isbn = Integer.parseInt(request.getParameter("isbn"));			
			Book newBook = new Book(title,author,isbn);
			request.setAttribute("ksiazka", newBook);
			getServletContext().getRequestDispatcher("/WEB-INF/views/result.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
