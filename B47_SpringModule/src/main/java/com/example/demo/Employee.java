package com.example.demo;

import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
  public class Employee {
	private int id;
	private String name;
	private Locale dOB;
	private float salary;
	private String address;
	private String designation;
	private int shop_id;
	
	
	public Employee() {
		super();
	}


	public Employee(int id, String name, Locale dOB, float salary, String address, String designation, int shop_id) {
		super();
		this.id = id;
		this.name = name;
		this.dOB = dOB;
		this.salary = salary;
		this.address = address;
		this.designation = designation;
		this.shop_id = shop_id;
	}

   @Id
   //@GeneratedValue
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Locale getdOB() {
		return dOB;
	}


	public void setdOB(Locale dOB) {
		this.dOB = dOB;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public int getShop_id() {
		return shop_id;
	}


	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dOB=" + dOB + ", salary=" + salary + ", address=" + address
				+ ", designation=" + designation + ", shop_id=" + shop_id + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getdOB()=" + getdOB() + ", getSalary()=" + getSalary() + ", getAddress()="
				+ getAddress() + ", getDesignation()=" + getDesignation() + ", getShop_id()=" + getShop_id()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


    
	
	
		
}
