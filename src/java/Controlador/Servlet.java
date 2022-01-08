/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class Servlet extends HttpServlet {

    Controlador controlador = new Controlador();

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

        String y = request.getParameter("LadoA");
        String option = request.getParameter("selectOption");
        String x = request.getParameter("LadoB");
        String figura = "";
        if (null != y) switch (option) {
            case "tr":
                figura = "Triangulo";
                break;
            case "cu":
                figura = "Cuadrado";
                break;
            case "re":
                figura = "Rectangulo";
                break;
            case "ro":
                figura = "Rombo";
                break;
            default:
                figura = "";
                break;
        }

        if ("".equals(y) || "".equals(x)) {
            y = "0";
            x = "0";
        }

        float ladoA = Float.valueOf(y);
        float ladoB = Float.valueOf(x);
        float resultado = controlador.seleccionarFigura(option, ladoB, ladoA);
        String valor = String.valueOf(resultado);

        request.setAttribute("valor", valor);
        request.setAttribute("figura", figura);
        RequestDispatcher reenvio = request.getRequestDispatcher("index.jsp");
        reenvio.forward(request, response);

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
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
