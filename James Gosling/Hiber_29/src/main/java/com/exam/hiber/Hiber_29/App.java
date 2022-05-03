package com.exam.hiber.Hiber_29;

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
        
        Student_29 st = new Student_29();
        Dep_29 dep = new Dep_29();
        
        st.setAddress("mumbai");
        st.setDep_id(4);
        st.setGrade("C");
        st.setStud_name("Tushar");
        
        dep.setDep_id(4);
        dep.setDep_loc("A100");
        dep.setDep_name("SCEE");
        dep.setNTstaff(12);
        dep.setTstaff(40);
        
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(st);
        session.save(dep);
        session.getTransaction().commit();
        session.close();
    }
}
