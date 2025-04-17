package com.LibraryInformation;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class SelectAllBooks {
public static void main(String[] args) 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vemula");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	String hql="from Library";
	Query query=em.createQuery(hql);
	List<Library>l1=query.getResultList();
	
	for(Library ll:l1)
	{
		System.out.println(ll.getBid()+" "+ll.getBname()+" "+ll.getBPrice());
	}
}

}
