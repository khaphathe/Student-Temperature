/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.AdminTBL;

/**
 *
 * @author karabol7
 */
@Stateless
public class AdminTBLFacade extends AbstractFacade<AdminTBL> implements AdminTBLFacadeLocal {

    @PersistenceContext(unitName = "StundentTempatureEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdminTBLFacade() {
        super(AdminTBL.class);
    }
    
}
