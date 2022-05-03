package com.exam.ORM.ORM_43_44_45.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.exam.ORM.ORM_43_44_45.entities.Food;



public class FoodDao {
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Food food)
	{
		Integer i=(Integer)this.hibernateTemplate.save(food);//return no of rows affected
		return i;
	}

	public List<Food> getAllFoods(){
		List<Food> list = this.hibernateTemplate.loadAll(Food.class) ;
		return list;
	}
	
	@Transactional
	public void update(Food food) {
		 this.hibernateTemplate.update(food);
		
	}
	@Transactional
	public void delete(int fid) {
		Food food = (Food) this.hibernateTemplate.get(Food.class, fid);
		this.hibernateTemplate.delete(food);
	}

	
}
