package com.exam.hiber.Hiber_29;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		String sel2 = "select s.stud_id, s.stud_name, d.dep_loc from Student_29 s,Dep_29 d where s.dep_id = d.dep_id";
		String sel1 = "select s.stud_id, s.stud_name from Student_29 s,Dep_29 d where s.dep_id = d.dep_id and d.dep_name='SCEE'";
		
		Query q = session.createQuery(sel2);
		
		 
		List list = q.list();
		
		Iterator it=list.iterator();
        while(it.hasNext())
        {
            Object rows[] = (Object[])it.next();
            System.out.println(rows[0]+ " -- " +rows[1]+" -- "+rows[2] );
            //System.out.println(rows[0]+ " -- " +rows[1] + "--"+rows[2]);
        }
	}

}
