/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.csConexion;
import Modelo.csUsuario;
import Modelo.csValidar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ingSergio
 */
public class srvLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            RequestDispatcher rd ;
            String usuario, contrasenia;
            Boolean encontrado=false;
            String perfil;
            
            usuario = request.getParameter("txtUsuario");
            contrasenia = request.getParameter("txtPassword");
            
            //csValidar c = new csValidar(usuario,contrasenia);
            csUsuario u = new csUsuario();
            //encontrado=c.validarUsuario();
            perfil=u.buscarUsuario(usuario, contrasenia);
            //csConexion c = new csConexion();
            //perfil = c.conectar();
              if (perfil !="")
              {
                encontrado=true;
              }
            
            request.setAttribute("respuesta", encontrado);
            request.setAttribute("perfil",perfil);
            rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
           /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet srvLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Usted esta en el servlet " + request.getContextPath() + "</h1>");
            out.println("perfil: " + perfil);
           
            out.println("Respuesta del Modelo: " + encontrado);
            out.println("</body>");
            out.println("</html>");*/
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}