package com.example.HibernateOneToOneRel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App 
{
public static void main(String args[]) {
		
		SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try {
			Person person=new Person();
			person.setpName("Ram");
			person.setpEmail("ram@gmail.com");
			
			Person person1=new Person();
			person1.setpName("Krushna");
			person1.setpEmail("krushna@gmail.com");
			
			Person person2=new Person();
			person2.setpName("laxman");
			person2.setpEmail("laxman@gmail.com");
			
			PassportDetails passport=new PassportDetails();
			passport.setPassportType("Regular");
			
			PassportDetails passport1=new PassportDetails();
			passport1.setPassportType("Regular");
			
			PassportDetails passport2=new PassportDetails();
			passport2.setPassportType("Regular");
			
			person.setPassport(passport);
			person1.setPassport(passport1);
			person2.setPassport(passport2);
			passport.setPerson(person);
			passport1.setPerson(person1);
			passport2.setPerson(person2);
			
			session.save(person);
			session.save(person1);
			session.save(person2);
			
			session.getTransaction().commit();
			
			 Person retrievedPerson=session.get(Person.class, person.getpId());
			 PassportDetails retrievedPassport=retrievedPerson.getPassport();

			 System.out.println("Person ID: "+retrievedPerson.getpId());
			 System.out.println("Person Name: "+retrievedPerson.getpName());
			 System.out.println("Person Email: "+retrievedPerson.getpEmail());
			 System.out.println("Passport: "+retrievedPassport.getPassportId());
			 System.out.println("Passport Type: "+retrievedPassport.getPassportType());
		}
		finally 
		{
			session.close();
            sessionFactory.close();
		}
	}
    
}
