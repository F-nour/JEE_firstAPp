package com.app.jee_firstapp.servlet;

import com.app.jee_firstapp.beans.Author;
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
        Author author= new Author();
        author.setLastname("Youssef");
        author.setFirstName("Nour-eddine");
        author.setActif(true);
        request.setAttribute("author", author);
        this.getServletContext().getRequestDispatcher("/pages/essai.jsp").forward(request, response);
    }

}




