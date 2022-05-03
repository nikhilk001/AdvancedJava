package com.exam.hiber.Hiber_29;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="D_29")
public class Dep_29 {
	@Id
	private int dep_id;
	private String dep_name;
	private String dep_loc;
	private int Tstaff;
	private int NTstaff;
	public int getDep_id() {
		return dep_id;
	}
	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public String getDep_loc() {
		return dep_loc;
	}
	public void setDep_loc(String dep_loc) {
		this.dep_loc = dep_loc;
	}
	public int getTstaff() {
		return Tstaff;
	}
	public void setTstaff(int tstaff) {
		Tstaff = tstaff;
	}
	public int getNTstaff() {
		return NTstaff;
	}
	public void setNTstaff(int nTstaff) {
		NTstaff = nTstaff;
	}
	public Dep_29() {
		super();
		// TODO Auto-generated constructor stub
	}
}
