/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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
public class EditStudentServlet extends HttpServlet {
   @EJB
    private StudentsTBLFacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        
        
        
        for (int i = 0; i < 10; i++) {
            
        }
        
         
         
        
        StudentsTBL stbl = creationStudentTable(name,surname, id);
            sfl.edit(stbl);
            
          request.setAttribute("name", name);
        request.setAttribute("surname", surname);
        request.setAttribute("id", id);
         
       
        
            
        RequestDispatcher rd = request.getRequestDispatcher("edit_outcome.jsp");
        rd.forward(request, response);
        
    }
     private StudentsTBL creationStudentTable(String name, String surname,Long id) {
        StudentsTBL bl = sfl.find(id);
        
        bl.setName(name);
        bl.setSurname(surname);
        return bl;
     }
 
}
