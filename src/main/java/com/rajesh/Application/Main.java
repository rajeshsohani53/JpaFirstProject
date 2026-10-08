package com.rajesh.Application;

import com.rajesh.entity.Games;
import com.rajesh.util.DbUtil;
import com.rajesh.util.EntityManagerFactoryProvider;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {
	Games g;
 public static void main(String[] args) {
	//EntityManagerFactory emf=EntityManagerFactoryProvider.getEntityManagerFactory();
	//EntityManager em=emf.createEntityManager();
	//if(emf!=null)
	//{
		//System.out.println("Database Connected");
	//}
	
	//emf.close();
//	 Games g2=new Games();
//	 g2.setGame_Name("Game 2");
//	 g2.setGame_NoOf_Players(4);
//	 g2.setGame_Mode("Offline_2");
	 
	 DbUtil.curdOperations(em->{
		 Games g=em.find(Games.class,1);
	     System.out.println(g);	 
		 
	 });
}
}
