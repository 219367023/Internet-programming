/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jacob
 */
public class ControllerServlet extends HttpServlet {
    
    @EJB ListSBLocal lsl;
    
    

     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        String op = request.getParameter("op");
        String url = "index.html";
        
        
        if(op.equals("add")){
            String numbStr = request.getParameter("number");
            Integer num = Integer.parseInt(numbStr);
            
            
            lsl.add(num);
            request.SetAttribute("numbStr",numbStr);
            url = "outcome.jsp";
            
        }
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request,response);
        
    }

     

}
