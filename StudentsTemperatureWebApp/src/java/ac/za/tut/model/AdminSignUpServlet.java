/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.AdminTBLFacadeLocal;
import za.ac.tut.entities.AdminTBL;

/**
 *
 * @author karabol7
 */
public class AdminSignUpServlet extends HttpServlet {

    @EJB
    private AdminTBLFacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
        String contact = request.getParameter("contact");
        String password = request.getParameter("password");

       // AdminTBL admin = createAdmin(name, surname, email, password, contact);
        AdminTBL admin1 = new AdminTBL(Long.MIN_VALUE, surname, name, surname, password, contact, email);
        sfl.create(admin1);

        RequestDispatcher disp = request.getRequestDispatcher("admin_login.html");
        disp.forward(request, response);

    }

//    private AdminTBL createAdmin(String name, String surname, String email, String password, String contact) {
//        AdminTBL admin = new AdminTBL();
//        admin.setEmail(email);
//        admin.setName(name);
//        admin.setContact(contact);
//        admin.setContact(contact);
//        admin.setSurname(surname);
//        admin.setPassword(password);
//
//        return admin;
//    }

}
