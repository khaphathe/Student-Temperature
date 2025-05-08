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
public class SubmitTemperatureSelvet extends HttpServlet {
  @EJB
    private StudentsTBLFacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        Long id = Long.parseLong(request.getParameter("id"));
       
        String gender = request.getParameter("gender");
        Double temperature =Double.parseDouble(request.getParameter("temperature"));
        
         
        String status = "normal";
        
        if(temperature > 37){
            status ="high";
        }
        else if(temperature<35)
        {
            status = "low";
        }
        
        
        request.setAttribute("name", name);
        request.setAttribute("id", id);
        request.setAttribute("status", status);
        
        boolean check = false;
        
        String url = "error_page.jsp";
        String idStudent = id+"";

        if(idStudent.length() == 9){
            for (int i = 0; i < idStudent.length(); i++) {
                char c = idStudent.charAt(i);
                if(Character.isDigit(c)){
                    url ="temperature_outcome.jsp";
                    check = true;
                }
                else{
                    url = "error_page.jsp";
                    check = false;
                    break;
                }
            }
        }
        
        if (check) {
            StudentsTBL stbl = creationStudentTable(name,surname,id,gender,temperature);
            sfl.create(stbl);
        }
        
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
        
        
    }

    private StudentsTBL creationStudentTable(String name, String surname,Long id, String gender, Double temperature) {
        StudentsTBL bl = new StudentsTBL();
        bl.setCreationDate(new Date());
        bl.setGender(gender);
        bl.setName(name);
        bl.setSurname(surname);
        bl.setId(id);
        
         
        bl.setTemperature(temperature);
        String status = "normal";
        
        if(temperature > 37){
            status ="high";
        }
        else if(temperature<35)
        {
            status = "low";
        }
        return bl;
    }
    
}
