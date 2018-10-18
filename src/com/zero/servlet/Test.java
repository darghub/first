package com.zero.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zero.beans.Somme;

//@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Somme sum=new Somme();
		String ok=request.getParameter("ok");
		int a=Integer.parseInt(request.getParameter("a"));
		int b=Integer.parseInt(request.getParameter("b"));
		sum.setA(a);
		sum.setB(b);
		request.setAttribute("ok", ok);
		request.setAttribute("somme",sum.sum());
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp").forward( request, response );
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
