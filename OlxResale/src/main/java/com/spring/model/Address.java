package com.spring.model;

public class Address {
	private int  city;		
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public int getSublocation() {
		return sublocation;
	}
	public void setSublocation(int sublocation) {
		this.sublocation = sublocation;
	}
	public int getState() {
		return state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int city, int sublocation, int state, int pincode, int country, int street, int userId,
			int constraint) {
		super();
		this.city = city;
		this.sublocation = sublocation;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
		this.street = street;
		this.userId = userId;
		this.constraint = constraint;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", sublocation=" + sublocation + ", state=" + state + ", pincode=" + pincode
				+ ", country=" + country + ", street=" + street + ", userId=" + userId + ", constraint=" + constraint
				+ "]";
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getCountry() {
		return country;
	}
	public void setCountry(int country) {
		this.country = country;
	}
	public int getStreet() {
		return street;
	}
	public void setStreet(int street) {
		this.street = street;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getConstraint() {
		return constraint;
	}
	public void setConstraint(int constraint) {
		this.constraint = constraint;
	}
	private int sublocation;	
	 private int  state; 		
	 private int  pincode;		
	 private int  country;		
	  private int street	;	
	 private int  userId	;	
	 private int   constraint;
	 
}
