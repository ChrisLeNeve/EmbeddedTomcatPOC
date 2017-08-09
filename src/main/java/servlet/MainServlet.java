/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.Writer;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Just a basic servlet that will handle our incoming requests.
 * @author Chris
 */
public class MainServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        Writer w = res.getWriter();
        w.write("<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<title>Christopher rox</title>"
                + "</head>"
                + "<body>"
                + "hello world!"
                + "</body>"
                + "</html>");
        w.flush();
        w.close();
    }
}
