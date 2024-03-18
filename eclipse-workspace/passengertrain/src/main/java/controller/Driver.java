package controller;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Passenger;
import dto.Train;

public class Driver {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jeeva");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Train t1=new Train();
//		t1.settName("superfast");
//		t1.setNoOfCoaches(9);
//		t1.setStartingPoint("chennai central");
//		t1.setDestination("erode");
//		
//		Train t2=new Train();
//		t2.settId(2);
//		t2.settName(" covai express");
//		t2.setNoOfCoaches(9);
//		t2.setStartingPoint("chennai central");
//		t2.setDestination("covai");
//		
//		et.begin();
//		em.merge(t1);
//		em.merge(t2);
//		et.commit();
		
//		Train t1= em.find(Train.class, 1);
//		
//		Passenger p1=new Passenger();
//		p1.setName("krishna");
//		p1.setContact(4568529879l);
//		p1.setT(t1);
//		
//		Passenger p2=new Passenger();
//		p2.setName("jeevakk");
//		p2.setContact(7539512589l);
//		p2.setT(t1);
//		
//		Passenger p3=new Passenger();
//		p3.setName("krishnavenijeeva");
//		p3.setContact(7639512889l);
//		p3.setT(t1);
//		
//		
//		
//		Passenger p4=new Passenger();
//		p4.setName("jeevarathinamkrishnaveni");
//		p4.setContact(7539512889l);
//		p4.setT(t1);
//		
//		
//		
//		et.begin();
//		em.merge(p1);
//		em.merge(p2);
//		em.merge(p3);
//		em.merge(p4);
//		em.merge(t1);
//		et.commit();
		
		
		// changing passenger 4 from train1 to train 2
//		Passenger p=em.find(Passenger.class, 4);
//		Train t=em.find(Train.class, 2);
//		p.setT(t);
//		et.begin();
//		em.merge(t);
//		et.commit();
		
		// adding the passenger 5&6 TO TRAIN 2
		
//		Passenger p5=new Passenger();
//		p5.setName("AMMU");
//		p5.setContact(4577529879l);
//		p5.setT(t2);
//		
//		Passenger p6=new Passenger();
//		p6.setName("chengachi");
//		p6.setContact(7778529879l);
//		p6.setT(t2);
//		
//		et.begin();
//		em.merge(p5);
//		em.merge(p6);
//		em.merge(t2);
//		
//		et.commit();
//	
		
		
		
//String q1="select p from Passenger p";//JPQL(java persistence Query language)* in this we are dealing with the objects present in the table not dealing with the rows
//Query query=em.createQuery(q1);
//List<Passenger> passenger=query.getResultList();//it is the only method to get the list of passenger objects present in
////passenger table
//
//for(Passenger p:passenger) {
//	System.out.println(p);
//}

		
		//to fetch the single object of data from passenger table we have method called"getSingleResult()"
		//if we did not use the where class we must use the method to get the list of objects using "getResultList()"
		//we cant get the single object from the table without using where clause

	String q1="select p from Passenger p where p.name=?1"; // wher p is the ref variable for object present in table and another isa ref variable for passenger class
	Query query=em.createQuery(q1);
	query.setParameter(1, "krishna");
	Passenger p=(Passenger)query.getSingleResult();
	System.out.println(p);
	
		
	}
}
