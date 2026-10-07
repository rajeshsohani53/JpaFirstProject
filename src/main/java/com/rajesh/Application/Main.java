package com.rajesh.Application;

import com.rajesh.entity.Games;
import com.rajesh.util.DbUtil;
import com.rajesh.util.EntityManagerFactoryProvider;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {
 public static void main(String[] args) {
	//EntityManagerFactory emf=EntityManagerFactoryProvider.getEntityManagerFactory();
	//EntityManager em=emf.createEntityManager();
	//if(emf!=null)
	//{
		//System.out.println("Database Connected");
	//}
	
	//emf.close();
	 Games g1=new Games();
	 g1.setGame_Name("Game 1");
	 g1.setGame_NoOf_Players(4);
	 g1.setGame_Mode("Offlibe");
	 DbUtil.insertData(g1);
}
}
