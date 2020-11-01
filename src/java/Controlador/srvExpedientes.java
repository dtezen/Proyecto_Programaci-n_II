package Controlador;

import Modelo.csExpedientesDAO;
import Modelo.csExpedientes;
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

public class srvExpedientes extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    csExpedientesDAO dao = new csExpedientesDAO();
    csExpedientes p=new csExpedientes();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet srvEmpleado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet srvEmpleado at " + request.getContextPath() + "</h1>");
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
                List<csExpedientes>datos=dao.listar();
                request.setAttribute("datos",datos);
                request.getRequestDispatcher("expedientes.jsp").forward(request, response);                
                break;
            case "Nuevo":
                request.getRequestDispatcher("addExpedientes.jsp").forward(request, response);
                break;
            case "Guardar":
                String id=request.getParameter("txtid");
                String tipo=request.getParameter("txttipo");
                String flujo=request.getParameter("txtflujo");
                String dependencia=request.getParameter("txtdependencia");
                String fecha=request.getParameter("txtfecha");
                String estado=request.getParameter("txtestado");
                p.setId(id);
                p.setTipo(tipo);
                p.setFlujo(flujo);
                p.setDependencia(dependencia);
                p.setFecha(fecha);
                p.setEstado(estado);
                dao.agregarExpediente(p);
                request.getRequestDispatcher("srvExpedientes?action=Listar").forward(request, response);
                break;
            case "Editar":
                String ide = request.getParameter("id");
                csExpedientes pe=dao.listarId(ide);
                request.setAttribute("persona", pe);
                request.getRequestDispatcher("editExpedientes.jsp").forward(request, response);
                break;
            case "Actualizar":
                String id1=request.getParameter("txtid");
                String tipo1=request.getParameter("txttipo");
                String flujo1=request.getParameter("txtflujo");
                String dependencia1=request.getParameter("txtdependencia");
                String fecha1=request.getParameter("txtfecha");
                String estado1=request.getParameter("txtestado");
                p.setId(id1);
                p.setTipo(tipo1);
                p.setFlujo(flujo1);
                p.setDependencia(dependencia1);
                p.setFecha(fecha1);
                p.setEstado(estado1);
                dao.actualizar(p);
                request.getRequestDispatcher("srvExpedientes?action=Listar").forward(request, response);
                break;
            case "Delete":
                String id2=request.getParameter("id");
                dao.delete(id2);
                request.getRequestDispatcher("srvExpedientes?action=Listar").forward(request, response);
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
