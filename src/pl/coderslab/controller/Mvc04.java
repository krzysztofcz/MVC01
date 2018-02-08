package pl.coderslab.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mvc04
 */
@WebServlet("/Mvc04")
public class Mvc04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mvc04() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/WEB-INF/views/form.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Book> newBooks = new ArrayList<>();
			for(int i=0;i<5;i++) {
				String tempt="title"+Integer.toString(i);
				String tempa="author"+Integer.toString(i);
				String tempi="isbn"+Integer.toString(i);

				String title = request.getParameter(tempt);
				String author = request.getParameter(tempa);
				String stringIsbn = request.getParameter(tempi);
				if(!tempi.equals(null)) {
					int isbn = Integer.parseInt(stringIsbn);
					Book newBook = new Book(title,author,isbn);
					newBooks.add(newBook);
				}			
			}
			int size = newBooks.size();

			request.setAttribute("ksiazki",newBooks);
			request.setAttribute("ileKsiazek", size);
			
			getServletContext().getRequestDispatcher("/WEB-INF/views/result.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			response.getWriter().append("ERROR : ").append(e.getMessage());
		}
	}

}
