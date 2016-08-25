///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.sv.udb.vista;
//
//import com.sv.udb.controlador.LugaAcceCtrl;
//import com.sv.udb.modelo.LugaAcce;
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
///**
// *
// * @author Laboratorio
// */
//
//@WebServlet(name = "LugaAcceServ", urlPatterns = {"/LugaAcceServ"})
//public class LugaAcceServ {
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        
//        
//       String mens="";
//        boolean esValido = request.getMethod().equals("POST");
//        if(esValido)
//        {            
//            String CRUD = request.getParameter("cursBoton");
//            if(CRUD.equals("Guardar"))
//            {
//                LugaAcce objeEqui = new LugaAcce();
//                objeEqui.setCodiLugaAcce(Integer.parseInt(request.getParameter("CodiLugaAcce")));
//                objeEqui.setUsuario(Integer.parseInt(request.getParameter("usuario")));
//                objeEqui.setFechad(request.getParameter("fechad"));
//                mens = new LugaAcceCtrl().guar(objeEqui) ? "Datos guardados" : "datos NO guardados";
//            }  
//            else if(CRUD.equals("Consultar"))
//            {
//                int codiEqui = Integer.parseInt(request.getParameter("codi_pres") == null ? "0" : request.getParameter("codi_pres"));
//                LugaAcce objeEqui = new LugaAcceCtrl().cons(codiEqui);
//                if(objeEqui != null)
//                {
//                    request.setAttribute("codigo",objeEqui.getCodigo());
//                    request.setAttribute("libro",objeEqui.getLibro());
//                    request.setAttribute("usuario",objeEqui.getUsuario());
//                    request.setAttribute("fechad",objeEqui.getFechad());
//                }
//                
//            }
//            else if(CRUD.equals("Eliminar"))
//            {
//                int codiEqui = Integer.parseInt(request.getParameter("codi_pres") == null ? "0" : request.getParameter("codi_pres"));                            
//                mens = new LugaAcceCtrl().Eliminar(codiEqui) ? "Datos Eliminados" : "datos NO eliminados";
//                
//            }
//            else if(CRUD.equals("Modificar"))
//            {
//                LugaAcce objeEqui = new LugaAcce();
//                objeEqui.setCodigo(Integer.parseInt(request.getParameter("codigo")));
//                objeEqui.setLibro(Integer.parseInt(request.getParameter("libro")));
//                objeEqui.setUsuario(Integer.parseInt(request.getParameter("usuario")));
//                objeEqui.setFechad(request.getParameter("fechad"));
//                mens = new LugaAccesCtrl().modi(objeEqui) ? "Datos Modificados" : "datos NO guardados";
//                
//            }
//            request.setAttribute("mensAler",mens);
//        request.getRequestDispatcher("/LugaAcce.jsp").forward(request, response);
//        }    
//        else
//        {
//            response.sendRedirect(request.getContextPath() +"/LugaAcce.jsp");
//        }
//    }
//    
//}
