package com.mcnz.jpa.examples;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
		EntityManager entityManager = emf.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Player p = new Player();
		p.setPassword("abc123");
		p.setLoginName("mj");
		p.setLastAccessTime(new java.util.Date());
		p.setRegistrationDate(LocalDate.now());
		p.setEmailAddress("mail@example.com");

		
		entityManager.persist(p);
		entityManager.getTransaction().commit();

	}

}
