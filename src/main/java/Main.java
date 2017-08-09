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
import servlet.MainServlet;

/**
 *
 * @author Chris
 */
public class Main {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8083);
        
        Context ctx = tomcat.addContext("/", new File(".").getAbsolutePath());
        
        //Register a servlet to our Tomcat instance...
        tomcat.addServlet(ctx, "My servlet name", new MainServlet());
        
        //... and map that servlet to every request that comes in.
        ctx.addServletMapping("/*", "My servlet name");
        
        tomcat.start();
        tomcat.getServer().await();
    }
}
