package com.CityTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class WashingtonTime extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Init method!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String pattern = "HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        TimeZone.setDefault(TimeZone.getTimeZone("Eastern Standard Time"));
        Date dataNewZone=new Date();
        String time = simpleDateFormat.format(dataNewZone);

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>" + "Время в Вашингтоне: " + time + "</h1>");
        printWriter.close();
    }

    @Override
    public void destroy() {
        System.out.println("Destroy method!");
    }
}

