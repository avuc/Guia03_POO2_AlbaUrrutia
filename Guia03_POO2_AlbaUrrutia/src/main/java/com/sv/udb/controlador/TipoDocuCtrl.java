/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.TipoDocu;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
/**
 *
 * @author Laboratorio
 */
public class TipoDocuCtrl {
    
      public boolean guar(TipoDocu obje)
    {
        boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try
        {
            em.persist(obje);
            tx.commit();
            resp = true;
        }
        catch(Exception ex)
        {
            tx.rollback();
            ex.printStackTrace();
        }
        finally
        {
            em.close();
            emf.close();            
        }
        return resp;
    }
    
    public TipoDocu cons(Long codiLugaAcce)
    {
        TipoDocu resp = null;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        try
        {
            resp = em.find(TipoDocu.class, codiLugaAcce);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            em.close();
            emf.close();            
        }
        return resp;
    }
    
    public List<TipoDocu> cons()
    {
        List<TipoDocu> resp = null;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        try
        {
            resp = em.createNamedQuery("LugaAcce.findAll", TipoDocu.class).getResultList();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            em.close();
            emf.close();            
        }
        return resp;
    }
    
}
