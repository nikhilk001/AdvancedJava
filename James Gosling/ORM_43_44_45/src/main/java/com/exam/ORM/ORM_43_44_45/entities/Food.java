package com.exam.ORM.ORM_43_44_45.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Food {
	@Id
	private int foodId;
	private String foodName;
	public Food() {
		super();
	}
	private int price;
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Food(int foodId, String foodName, int price) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.price = price;
	}
}
