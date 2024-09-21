package com.example.Lesson2;

import jakarta.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "com.example.Lesson2.CalculatorPageServlet",
        urlPatterns = "/calculator")
public class CalculatorPageServlet extends HttpServlet {

   /* @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(req.getMethod());
//        PrintWriter writer = resp.getWriter();
//        writer.println("Hello Servlet");
//        Date date = new Date();
//        int seconds = date.getSeconds();
//        int minutes = date.getMinutes();
//        int hours = date.getHours();
//        writer.println("It is time: " + hours + ":" + minutes + ":" + seconds);
//        String username = req.getParameter("username");
//        writer.println("Username: " + username);

        PrintWriter writer = resp.getWriter();
        String a = req.getParameter("a");
        writer.println("a: " + a);
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getMethod());
        PrintWriter writer = resp.getWriter();
        writer.println("Hello Servlet");
        Date date = new Date();
        int seconds = date.getSeconds();
        int minutes = date.getMinutes();
        int hours = date.getHours();
        writer.println("It is time: " + hours + ":" + minutes + ":" + seconds);
        String username = req.getParameter("username");
        writer.println("Username: " + username);
    }
}
