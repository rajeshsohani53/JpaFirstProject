package com.rajesh.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerFactoryProvider {
  private static EntityManagerFactory emf;
//The persistence-unit name from your persistence.xml
  private static final String PERSISTENCE_UNIT_NAME = "myJpaUnit";
    public static EntityManagerFactory getEntityManagerFactory()
    {
    	if(emf==null)
    	{
    		emf=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    		return emf;
    	}
    	return emf;
    }
    public static void shutdown() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
  
  
}
