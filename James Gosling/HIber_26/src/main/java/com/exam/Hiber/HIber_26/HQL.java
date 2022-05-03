package com.exam.Hiber.HIber_26;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session s = factory.openSession();
		
		String selectquery = "from Grocery where total_sales>:X";
		Query q = s.createQuery(selectquery);
		q.setParameter("X",50000 );
		
		List<Grocery> li = q.list();
		
		for(Grocery g:li) {
			System.out.println(g.getCategory()+" "+g.getPname()+" "+g.getPrice());
		}
		
		s.beginTransaction();
		String del = "update Grocery set price='1000' where pname='wheat'";
		Query q1 = s.createQuery(del);
		int s1 = q1.executeUpdate();
		System.out.println("Rows updated "+s1);
		s.getTransaction().commit();
		
		
		s.beginTransaction();
		String update = "delete Grocery where pname='jawar'";
		Query q2 = s.createQuery(update);
		int s2 = q2.executeUpdate();
		System.out.println("Rows Deleted "+s2);
		s.getTransaction().commit();
	}

}
