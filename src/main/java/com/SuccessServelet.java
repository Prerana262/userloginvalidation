package com;

 

import java.util.Date;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;

 

/**

* Servlet implementation class SuccessServlet

*/

public class SuccessServelet extends HttpServlet {

              private static final long serialVersionUID = 1L;

      

    /**

     * @see HttpServlet#HttpServlet()

     */

    public SuccessServelet() {

        super();

        // TODO Auto-generated constructor stub

    }

 

              /**

              * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)

              */

              protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

                           // TODO Auto-generated method stub

                           PrintWriter out = response.getWriter();

                           

                           out.println("<h4>Welcome " + request.getParameter("username") + ". Login Successful </h4>");

                           out.println("<a href=\"logout.html\"><button>Logout</button></a>");




              }

 

}