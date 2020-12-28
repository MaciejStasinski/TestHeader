package com.example.TestHeader;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testHeader")
public class testHeader extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public testHeader() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter responseWriter = response.getWriter();

        Enumeration<String> headerNames = request.getHeaderNames();
        int i=0;
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String value= request.getHeader(headerName);


            responseWriter.write("<p>" + headerName + ": " + value +"</p>");
        }
        response.addHeader("superGrupa", "podyplomowaJWD");
        response.setIntHeader("rokUkonczenia", 2019);
    }
}