package com.LibraryInformation;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SelectBook {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vemula");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Library l=em.find(Library.class, 102);
	if(l!=null)
	{
		System.out.println(l.getBid()+" "+l.getBname()+" "+l.getBPrice());
	}
	else System.out.println("ID not available");
}
}
