package com.mcnz.jpa.examples;

import jakarta.persistence.*;

public class JpaCrudExample {

	public static void main(String[] args) {
		JpaCrudExample.createRecord();
		JpaCrudExample.retrieveRecord();
		JpaCrudExample.updateRecord();
		JpaCrudExample.deleteRecord();


	}
	
	public static void deleteRecord() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
		EntityManager entityManager = emf.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Long key = Long.valueOf(1);
		Player p = entityManager.find(Player.class, key);
		
		entityManager.remove(p);
		
		entityManager.getTransaction().commit();
		
	}
	
	public static void updateRecord() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
		EntityManager entityManager = emf.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Long key = Long.valueOf(1);
		Player p = entityManager.find(Player.class, key);
		
		p.setPassword("kowabunga");
		
		entityManager.getTransaction().commit();
		
		
		
	}
	
	public static void retrieveRecord() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
		EntityManager entityManager = emf.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Long key = Long.valueOf(1);
		Player p = entityManager.find(Player.class, key);
		
		System.out.println(p.getPassword());
		
		entityManager.getTransaction().commit();
		
	}
	
	public static void createRecord() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
		EntityManager entityManager = emf.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Player p = new Player();
		p.setPassword("abc123");
		
		entityManager.persist(p);
		entityManager.getTransaction().commit();
		
	}

}
