package pl.coderslab.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class encoding
 */
@WebFilter("/*")
public class encoding implements Filter {

	private String encoding = "UTF-8";
	private String contentType = "text/html";
    /**
     * Default constructor. 
     */
    public encoding() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		request.setCharacterEncoding(encoding);
		response.setContentType(contentType);
		response.setCharacterEncoding(encoding);
		System.out.println("Filter is working !!! :D ");
		long startTime = System.currentTimeMillis();
		chain.doFilter(request, response);
		long stopTime = System.currentTimeMillis();
		System.out.println(startTime+" "+stopTime);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
