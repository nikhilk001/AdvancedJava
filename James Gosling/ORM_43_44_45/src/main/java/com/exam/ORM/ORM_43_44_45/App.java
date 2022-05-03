package com.exam.ORM.ORM_43_44_45;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exam.ORM.ORM_43_44_45.dao.FoodDao;
import com.exam.ORM.ORM_43_44_45.entities.Food;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	FoodDao fd = ctx.getBean("foodDao", FoodDao.class);
    	
    	Scanner sc = new Scanner(System.in);
    	boolean go = true;
    	
    	while(go) {
    		System.out.println("*************WELCOME TO Food Store***************");
    	       System.out.println("Press 1: To Add New Food");
    	       System.out.println("Press 2: To Display All Food Items");
    	       System.out.println("Press 3: To Update Item");
    	       System.out.println("Press 4: To Delete Item");
    	       System.out.println("Press 5: Exit");
    	       
    	       int ch = sc.nextInt();
    	       switch(ch) {
    	       case 1:
    	    	   System.out.println("Enter Id:");
    	    	   int Fid = sc.nextInt();
        	       System.out.println("Enter Food Name:");
        	       String Fname = sc.next();
        	       System.out.println("Enter Food Price:");
        	       int price = sc.nextInt();
        	       Food f = new Food(Fid,Fname,price);
        	       int s = fd.insert(f);
        	       System.out.println("Row Inserted "+s);
    	    	   break;
    	    	   
    	       case 2:
    	    	   List<Food>li = fd.getAllFoods();
    	    	   
    	    	   for(Food food:li) {
    	    		   System.out.println(food.getFoodId()+"<--->"+food.getFoodName()+"<--->"+food.getPrice());
    	    	   }
    	    	   break;
    	    	   
    	       case 3:
    	    	   System.out.println("Enter Id:");
    	    	   int Fid1 = sc.nextInt();
        	       System.out.println("Enter Food Name:");
        	       String Fname1 = sc.next();
        	       System.out.println("Enter Food Price:");
        	       int price1 = sc.nextInt();
        	       Food f1 = new Food(Fid1,Fname1,price1);
        	       fd.update(f1);
    	    	   break;
    	    	   
    	       case 4:
    	    	   System.out.println("Enter Id:");
    	    	   int Fid2 = sc.nextInt();
    	    	   fd.delete(Fid2);
    	    	   break;
    	       case 5:
    	    	   go=false;
    	    	   break;
    	       }
    	       
    	      
    	}
    }
}
