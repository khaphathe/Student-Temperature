/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.StudentsTBLFacadeLocal;
import za.ac.tut.entities.StudentsTBL;

/**
 *
 * @author karabol7
 */
public class ViewListServlet extends HttpServlet {
 @EJB
    private StudentsTBLFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<StudentsTBL> list = sfl.findAll();
        request.setAttribute("list", list);
        
        RequestDispatcher rd = request.getRequestDispatcher("admins.jsp");
        rd.forward(request, response);
        
    }
 
}
