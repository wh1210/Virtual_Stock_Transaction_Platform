package com.virtualStockPlatform.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="property")
	private double property;
	
	private ArrayList<Stock> stocksOwned;
	
	public Customer() {};

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public double getProperty() {
		return property;
	}

	public void setProperty(double property) {
		this.property = property;
	}

	public ArrayList<Stock> getStocksOwned() {
		return stocksOwned;
	}

	public void setStocksOwned(ArrayList<Stock> stocksOwned) {
		this.stocksOwned = stocksOwned;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", property=" + property + ", stocksOwned=" + stocksOwned + "]";
	}
	
	
}
