package com.exam.Hiber.HIber_26;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Grocery gc = new Grocery();
        gc.setPname("wheat");
        gc.setPrice(700);
        gc.setQuantity(5);
        gc.setTotal_price(65);
        gc.setTotal_sales(65000);
        gc.setCategory("Meal");
        
        Session s = factory.openSession();
        s.beginTransaction();
        s.save(gc);
        s.getTransaction().commit();
        s.close();
    }
}
