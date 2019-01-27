package com.Jam.Demo.Gun;

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
    	GuidewireName gn =new GuidewireName();
    	gn.setFname("LakshmiPrasannaKumari");
    	gn.setLname("konapalli");
    	gn.setMname("ViswanadhaReddy");
    	Guidewire claim = new Guidewire();
    	claim.setGid(123);
    	claim.setColor("green");
    	claim.setGname(gn);
    	Configuration con = new Configuration().configure().addAnnotatedClass(Guidewire.class);
    	
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(reg);
    	Session session = sf.openSession();
    	Transaction tx= session.beginTransaction();
    	session.save(claim);
    	//claim=(Guidewire)session.get(Guidewire.class,115);
    	tx.commit();
    	System.out.println(claim);
    	}
    

    }

