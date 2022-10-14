package com.app.jee_firstapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "EssaiServlet", value = "/essai")
public class EssaiServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String nom = "mon Créateur";
        request.setAttribute("nom", nom);
        request.setAttribute("name", name);
        request.setAttribute("heure", "jour");
        this.getServletContext().getRequestDispatcher("/pages/essai.jsp").forward(request, response);
    }

}




