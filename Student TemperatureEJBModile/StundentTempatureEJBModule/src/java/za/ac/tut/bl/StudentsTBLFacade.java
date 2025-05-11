/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.StudentsTBL;

/**
 *
 * @author BALOYI HOLANI
 */
@Stateless
public class StudentsTBLFacade extends AbstractFacade<StudentsTBL> implements StudentsTBLFacadeLocal {

    @PersistenceContext(unitName = "StundentTempatureEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentsTBLFacade() {
        super(StudentsTBL.class);
    }
    
}
