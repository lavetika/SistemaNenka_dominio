/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanenka;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alfonso Felix
 */
public class CreaBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManager em;
        
        EntityManagerFactory managerFactory
                    = Persistence.createEntityManagerFactory("SistemaNenkaPU");
            em = managerFactory.createEntityManager();
    }
    
}