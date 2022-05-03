package com.age;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calculate extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String date = req.getParameter("date");
		
		LocalDate db = LocalDate.parse(date);
		
		int year = db.getYear();
		int age = 2022-year;
		out.print(age);
		
		if(age<18) {
			out.print("<h2>You are not Eligible</h2>");
		}
		else {
			out.print("<h2>You  Eligible</h2>");
		}
	}
}
