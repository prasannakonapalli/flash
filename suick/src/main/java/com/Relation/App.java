package com.Relation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
        Laptop laptop = new Laptop();
        laptop.setLid(100);
        laptop.setLname("Dell");
       
        Student s= new Student();
        s.setRollno(1);
        s.setSname("Prasanna");
        s.setMarks(100);
       // s.setLaptop(laptop);
        s.getLaptop().add(laptop);
        laptop.getStudent().add(s);
      
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
    	
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(reg);
    	Session session = sf.openSession();
    	 session.beginTransaction();
    	session.save(laptop);
    	session.save(s);
    	session.getTransaction().commit();
    	
    	
    }
}
