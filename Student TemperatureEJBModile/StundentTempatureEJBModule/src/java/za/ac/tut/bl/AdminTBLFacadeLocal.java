/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.AdminTBL;

/**
 *
 * @author karabol7
 */
@Local
public interface AdminTBLFacadeLocal {

    void create(AdminTBL adminTBL);

    void edit(AdminTBL adminTBL);

    void remove(AdminTBL adminTBL);

    AdminTBL find(Object id);

    List<AdminTBL> findAll();

    List<AdminTBL> findRange(int[] range);

    int count();
    
}
