package com.app.jee_firstapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/bonjour")
public class BonjourServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public BonjourServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/pages/bonjour.jsp").forward(request, response);
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        String name = request.getParameter("name");
        String firstname = request.getParameter("firstname");

        HttpSession session = request.getSession();

        session.setAttribute("name", name);
        session.setAttribute("firstname", firstname);

        this.getServletContext().getRequestDispatcher("/pages/bonjour.jsp").forward(request, response);
    }

}