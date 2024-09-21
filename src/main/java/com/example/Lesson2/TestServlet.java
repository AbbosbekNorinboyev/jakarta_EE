package com.example.Lesson2;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "com.example.Lesson2.TestServlet", value = "/TestServlet")
public class TestServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Response from TestServlet");
        System.out.println(request.getMethod());
        PrintWriter writer = response.getWriter();
        writer.println("qwerty");
    }
}
