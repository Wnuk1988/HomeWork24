package com.CityTime.YearsOld;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Age extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        int age = Integer.parseInt(req.getParameter("age"));
        if (age >= 18) {
            writer.println("Вы совершеннолетний. Добро пожаловать на сайт!");
        } else {
            writer.println("Вам нету 18 лет, данный сайт запрещен!!!");
        }
        writer.close();
    }
}
