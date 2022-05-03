package com.exam.Hiber.HIber_26;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name="GC")
public class Grocery {
	
	@Id @GeneratedValue (strategy = GenerationType.SEQUENCE)
	private int pid;
	
	@Column (name="product_name")
	private String pname;
	
	private String category;
	
	@Column (length = 3)
	private int price;
	private int quantity;
	private int total_price;
	private int total_sales;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	public int getTotal_sales() {
		return total_sales;
	}
	public void setTotal_sales(int total_sales) {
		this.total_sales = total_sales;
	}
	public Grocery(int pid, String pname, String category, int price, int quantity, int total_price, int total_sales) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.total_price = total_price;
		this.total_sales = total_sales;
	}
	public Grocery() {
		super();
	}
}
