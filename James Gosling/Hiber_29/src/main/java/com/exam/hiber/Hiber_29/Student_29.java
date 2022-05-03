package com.exam.hiber.Hiber_29;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="S_29")
public class Student_29 {
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int stud_id;
	private String stud_name;
	private int dep_id;
	private String grade;
	private String address;
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public int getDep_id() {
		return dep_id;
	}
	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student_29(int stud_id, String stud_name, int dep_id, String grade, String address) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.dep_id = dep_id;
		this.grade = grade;
		this.address = address;
	}
	public Student_29() {
		super();
		// TODO Auto-generated constructor stub
	}
}
