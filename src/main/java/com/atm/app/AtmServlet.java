package com.atm.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AtmServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest resquest, HttpServletResponse response) 
                                                throws ServletException, IOException {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println(
                "<html>" +
                "<style type=\"text/css\">" +
                "   <!-- " +
                "   form { margin: 0 auto; width: 300px; padding: 1em; " +
                "           border: 10px solid #CCC; border-radius: 1em;} " +
                "   form div + div {margin-top: 1em;} " +
                "   label {display: inline-block; width: 90px; text-align: right;} " +
                "   input:focus, textarea:focus {border-color: #000;} " +
                "   .button {padding-left: 125px;} " +
                "   button {margin-left: .5em;} " +
                "   button { border: none; background: #3a7999; color: #f2f2f2; " +
                "           padding: 8px; font-size: 20px; border-radius: 5px; " +
                "           position: relative; box-sizing: border-box; " +
                "           transition: all 500ms ease; " +
                "   --> " +
                "</style> " +
                "<head><title>ATM</title></head> " +
                "   <body> " +
                "       <form action=\"/withdraw\" method=\"post\"> " +
                "           <div> " +
                "                   <label for=\"amount\">Cantidad:</label> " +
                "                   <input type=\"text\" id=\"amount\" name=\"amount\" /> " +
                "           </div> " +
                "           <div class=\"button\"> " +
                "                   <button type=\"submit\" id=\"withdraw\">Retirar</button> " +
                "           </div> " +
                "       </form> " +
                "   </body> " +
                "</html> ");
    }
}



