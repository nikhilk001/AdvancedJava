package com.number;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArmString extends HttpServlet{
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			
			String number = req.getParameter("num");
			int n = Integer.parseInt(number);
			if(n % 2 ==1) {
				out.print("<h2>Prime</h2>");
			}
	}
}
