package com.rajesh.util;

import java.util.function.Consumer;

import com.rajesh.entity.Games;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class DbUtil {

    public static void insertData(Games game) {

        EntityManagerFactory emf = EntityManagerFactoryProvider.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
        EntityTransaction tr = em.getTransaction();

        try {
            tr.begin();                    
            em.persist(game);
            tr.commit();
            System.out.println("Saved: " + game);
        } catch (Exception e) {
            if (tr.isActive()) {
                tr.rollback();           
            }
            e.printStackTrace();
        } finally {
            em.close();               
        }
      
    }
    
    
    public static void curdOperations(Consumer<EntityManager> work)
    {
        EntityManagerFactory emf=EntityManagerFactoryProvider.getEntityManagerFactory();
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        //actual work
        work.accept(em);
        //
        tx.commit();
        em.close();
        
    }
}