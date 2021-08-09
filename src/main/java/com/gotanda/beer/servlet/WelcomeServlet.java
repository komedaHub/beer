package com.gotanda.beer.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("WelcomeServlet doPost");
        doGet(request, response);
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("WelcomeServlet doGet");
        // response.setContentType("application/json");
        // PrintWriter out = response.getWriter();//[5]
        // out.flush();
    }
}
