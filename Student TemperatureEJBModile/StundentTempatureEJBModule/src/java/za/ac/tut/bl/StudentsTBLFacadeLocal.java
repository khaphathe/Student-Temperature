/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.StudentsTBL;

/**
 *
 * @author BALOYI HOLANI
 */
@Local
public interface StudentsTBLFacadeLocal {

    void create(StudentsTBL studentsTBL);

    void edit(StudentsTBL studentsTBL);

    void remove(StudentsTBL studentsTBL);

    StudentsTBL find(Object id);

    List<StudentsTBL> findAll();

    List<StudentsTBL> findRange(int[] range);

    int count();
    
}
