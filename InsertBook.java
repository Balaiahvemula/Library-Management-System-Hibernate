package com.LibraryInformation;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertBook {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vemula");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Library l=new Library();
	l.setBid(104);
	l.setBname("English");
	l.setBPrice(300.0);
	et.begin();
	em.persist(l);
	System.out.println("Data Saved");
	et.commit();
}
}
