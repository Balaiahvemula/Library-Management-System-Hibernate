package com.LibraryInformation;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteBook {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vemula");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Library l=em.find(Library.class, 103);
	if(l!=null) {
	et.begin();
	em.remove(l);
	et.commit();
	}
	else System.out.println("ID not available");
}
}
