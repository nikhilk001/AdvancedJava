package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cook
 */
@WebServlet("/cook")
public class cook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		Cookie user = new Cookie("username", req.getParameter("user"));
		Cookie pass = new Cookie("password", req.getParameter("pass"));
		res.addCookie(user);
		res.addCookie(pass);
		
		PrintWriter out = res.getWriter();
		
		Cookie cookie[] = null;
		Cookie ck = null;
		cookie = req.getCookies();
		
		if(cookie!=null)
		{
			for(int i=0;i<cookie.length;i++)
			{
				ck = cookie[i];
				//to extract key-getName()
				//to extract value-getValue()
				out.println("key:"+ ck.getName()+ "  ,  ");
				out.println("value:"+ ck.getValue()+"\n");
			}
		}
	}

}
