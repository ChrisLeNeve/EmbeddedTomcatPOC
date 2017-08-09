/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 *
 * @author Chris
 */
public class Main {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello world!");
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8083);
        
        Context ctx = tomcat.addContext("/", new File(".").getAbsolutePath());
        
        tomcat.addServlet(ctx, "Embedded", new HttpServlet() {
            @Override
            protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
                Writer w = res.getWriter();
                w.write("<!DOCTYPE html><html><head><title>Chris rox</title></head><body>hello world!</body></html>");
                w.flush();
                w.close();
            }
        });
        
        ctx.addServletMapping("/*", "Embedded");
        
        tomcat.start();
        tomcat.getServer().await();
    }
}
