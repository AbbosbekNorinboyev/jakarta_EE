package com.example.Lesson2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "com.example.Lesson2.CalculatorServlet",
        urlPatterns = "/servlet")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(req.getMethod());
//        PrintWriter writer = resp.getWriter();
//        int a = Integer.parseInt(req.getParameter("a"));
//        int b = Integer.parseInt(req.getParameter("b"));
//        String operator = req.getParameter("o");
//        String result = a + " " + operator + " " + b + " = ";
//        if (operator.equals("+")) {
//            result = result + (a + b);
//        } else if (operator.equals("-")) {
//            result = result + (a - b);
//        } else if (operator.equals("*")) {
//            result = result + (a * b);
//        } else {
//            result = result + (a / b);
//        }
//        writer.println("<p>" + result + "</p>");

        System.out.println(req.getMethod());
        resp.getWriter().println("Hello CalculatorServlet");
        PrintWriter writer = resp.getWriter();
        writer.println("""
                <form>
                    <label>A : <input type="number"></label>
                    <label>B : <input type="number"></label>
                    <input type="submit" value="Calculator">
                </form>
                """);
    }
}
