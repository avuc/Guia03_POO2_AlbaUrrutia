/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.TipoDocu;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
/**
 *
 * @author Vanessa 
 * @version 1.0 27 de Agosto de 2016
 */
public class TipoDocuCtrl {
    
    
    /**
 * Método que guarda un objeto del tipo LugaAcce en la bd
 * @param obje objeto de "TipoDocu"
 * @return boolean si la operación se realizó correctamente o no se hizo la operación
 * @exception Error al continuar con el objeto         
 * @since incluido desde la version 1.0
 */
    
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
        }
        em.close();
        emf.close();
        return resp;
    }
     /**
 * Método que consulta todos los registros de la base de datos
 * @return Lista de objetos tipo TipoDocu
 * @exception Error al consultar       
 * @since incluido desde la version 1.0
 */
     public List<TipoDocu>  ConsTodo()
    {
        List<TipoDocu> resp = new ArrayList<>();
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
           EntityManager em = emf.createEntityManager();
        try
        {
          TypedQuery<TipoDocu> query =em.createNamedQuery("TipoDocu.findAll", TipoDocu.class);
          resp = query.getResultList();
        }
        catch(Exception ex)
        {
            
        }
        return resp;
       
    }
     
/**
* Método que modifica un objeto de la base de dtos
* @param obje Objeto del tipo TipoDocu
* @return boolean si la operación se realizó correctamente o no
* @exception Error al modificar registro         
* @since incluido desde la version 1.0
*/
        public boolean modi(TipoDocu obje)
    {
        boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
         TipoDocu objeTipoDocu = null;
        tx.begin();
        try
        {
            
            objeTipoDocu = em.find(TipoDocu.class, obje.getCodiTipoDocu());
            objeTipoDocu.setNombTipoDocu(obje.getNombTipoDocu());
            tx.commit();
            resp = true;
        }
        catch(Exception ex)
        {
            tx.rollback();
        }
        em.close();
        emf.close();
        return resp;
    }
    
 /**
 * Método que cambia el estado a un registro de la base de datos
 * @param empId Código del Registro
 * @return boolean si la operación se realizó correctamente o no
 * @exception Error al cambiar estado al registro
 * @since incluido desde la version 1.0
 */
    public boolean elim(Long empId)
    {
        boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
         TipoDocu objeTipoDocu = null;
        tx.begin();
        try
        {
            
            objeTipoDocu = em.find(TipoDocu.class, empId);
            objeTipoDocu.setEsta(0);
            objeTipoDocu.setFechBaja(new Date());
            tx.commit();
            resp = true;
        }
        catch(Exception ex)
        {
            tx.rollback();
        }
        em.close();
        emf.close();
        return resp;
    }


/**
* Método que cambia estado a un registro de la base de datos
* @param empId obtiene el codigo
* @return boolean si la operación se realizó correctamente o no
* @exception Error al cambiar estado
* @since incluido desde la version 1.0
*/
     
    public TipoDocu get(Long empId){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        TipoDocu resp = null;
        
        try{
            resp = em.find(TipoDocu.class, empId);
            
        }catch(Exception e){
            e.printStackTrace();
        }                
        return resp;
    }
    
}
