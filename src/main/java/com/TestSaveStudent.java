package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sarfu");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
//		Student s1 = new Student();
//		s1.setName("Krish");
//		s1.setAge(23);
//		s1.setMarks(99);
//		
//		Student s2 = new Student();
//		s2.setName("Krish");
//		s2.setAge(23);
//		s2.setMarks(99);
//		
//		Student s3 = new Student();
//		s3.setName("Krish");
//		s3.setAge(23);
//		s3.setMarks(99);
//		
//		Course c1 = new Course();
//		c1.setName("java");
//		c1.setDuration("6 month");
//		c1.setFees(40000);
//		c1.setTrainer("faizan");
//		
//		Course c2 = new Course();
//		c2.setName("java");
//		c2.setDuration("6 month");
//		c2.setFees(40000);
//		c2.setTrainer("faizan");
//		
//		Course c3 = new Course();
//		c3.setName("java");
//		c3.setDuration("6 month");
//		c3.setFees(40000);
//		c3.setTrainer("faizan");
//		
//		Course c4 = new Course();
//		c4.setName("java");
//		c4.setDuration("6 month");
//		c4.setFees(40000);
//		c4.setTrainer("faizan");
//		
//		Course c5 = new Course();
//		c5.setName("java");
//		c5.setDuration("6 month");
//		c5.setFees(40000);
//		c5.setTrainer("faizan");
//		
//		List<Course> l = new ArrayList<Course>();
//		l.add(c1);
//		l.add(c2);
//		l.add(c3);
//		l.add(c4);
//		
//		List<Course> l2 = new ArrayList<Course>();
//		l2.add(c1);
//		l2.add(c2);
//		l2.add(c3);
//		l2.add(c4);
//		
//		List<Course> l3 = new ArrayList<Course>();
//		l3.add(c1);
//		l3.add(c2);
//		l3.add(c3);
//		l3.add(c4);
//		
//		s1.setCourses(l);
//		
//		
//		s2.setCourses(l2);
//		
//		
//		s3.setCourses(l3);
//		
//		entityTransaction.begin();
//		entityManager.persist(s1);
//		entityManager.persist(s2);
//		entityManager.persist(s3);
//		entityManager.persist(c1);
//		entityManager.persist(c2);
//		entityManager.persist(c3);
//		entityManager.persist(c4);
//		entityTransaction.commit();
		Student s =	entityManager.find(Student.class,1);
		System.out.println("the Student  name is"+s.getName());
		
		
	
	}

}
