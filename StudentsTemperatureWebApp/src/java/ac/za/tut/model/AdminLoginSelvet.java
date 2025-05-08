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
import za.ac.tut.bl.AdminTBLFacadeLocal;
import za.ac.tut.bl.StudentsTBLFacadeLocal;
import za.ac.tut.entities.AdminTBL;
import za.ac.tut.entities.StudentsTBL;

/**
 *
 * @author karabol7
 */
public class AdminLoginSelvet extends HttpServlet {

    @EJB
    private AdminTBLFacadeLocal afl;
    @EJB
    private StudentsTBLFacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        List<StudentsTBL> list = sfl.findAll();
        request.setAttribute("list", list);
        
        boolean checkPasswordl = false;
        boolean checkEmail = false;
        
        List<AdminTBL> admin = afl.findAll();
       
        for (AdminTBL adminTBL : admin) {
            if(adminTBL.getPassword().equals(password) ){
                checkPasswordl = true;
                break;
            }
        }
        
        for (AdminTBL adminTBL : admin) {
            if(adminTBL.getEmail().equals(email) ){
                checkEmail = true;
                break;
            }
        }
        
        String url = "admin_login.html";
        
        
        if(checkPasswordl){
            if(checkEmail){
                url = "admins.jsp";
            }
            
        }
        
        

       
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);

    }


}
