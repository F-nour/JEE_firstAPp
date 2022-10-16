package com.app.jee_firstapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/bonjour")
public class Bonjour extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Bonjour() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/pages/bonjour.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");

        request.setAttribute("nom", nom);

        this.getServletContext().getRequestDispatcher("/pages/bonjour.jsp").forward(request, response);
    }

}