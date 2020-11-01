/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.csEmpresaDAO;
import Modelo.csEmpresa;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dennys Tezén
 */

public class srvEmpresa extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    csEmpresaDAO dao = new csEmpresaDAO();
    csEmpresa p=new csEmpresa();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet srvEmpresa</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet srvEmpresa at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String accion=request.getParameter("action");
        switch (accion) {
            case "Listar":
                List<csEmpresa>datos=dao.listar();
                request.setAttribute("datos",datos);
                request.getRequestDispatcher("empresa.jsp").forward(request, response);                
                break;
            case "Nuevo":
                request.getRequestDispatcher("addEmpresa.jsp").forward(request, response);
                break;
            case "Guardar":
                String id=request.getParameter("txtid");
                String puesto=request.getParameter("txtpuesto");
                String nombre=request.getParameter("txtnombre");
                String direccion=request.getParameter("txtdireccion");
                String telefono=request.getParameter("txttelefono");
                String email=request.getParameter("txtemail");
                p.setId(id);
                p.setNom(nombre);
                p.setDireccion(direccion);
                p.setTel(telefono);
                p.setEmail(email);
                dao.agregarEmpresa(p);
                request.getRequestDispatcher("srvEmpresa?action=Listar").forward(request, response);
                break;
            case "Editar":
                String ide = request.getParameter("id");
                csEmpresa pe=dao.listarId(ide);
                request.setAttribute("persona", pe);
                request.getRequestDispatcher("editEmpresa.jsp").forward(request, response);
                break;
            case "Actualizar":
                String id1=request.getParameter("txtid");
                String nombre1=request.getParameter("txtnombre");
                String direccion1=request.getParameter("txtdireccion");
                String telefono1=request.getParameter("txttelefono");
                String email1=request.getParameter("txtemail");
                p.setId(id1);
                p.setNom(nombre1);
                p.setDireccion(direccion1);
                p.setTel(telefono1);
                p.setEmail(email1);
                dao.actualizar(p);
                request.getRequestDispatcher("srvEmpresa?action=Listar").forward(request, response);
                break;
            case "Delete":
                String id2=request.getParameter("id");
                dao.delete(id2);
                request.getRequestDispatcher("srvEmpresa?action=Listar").forward(request, response);
                break;
            default:
                throw new AssertionError();
        }
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
