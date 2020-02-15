package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity

public class Registration {
	@Id
	@NotNull
	@GeneratedValue
	private int user_pk;
	@NotNull
	private String first_name; 
	@NotNull
	private String last_name;	
	@NotNull
	private int age;	
	@NotNull
	private String gender; 
	@NotNull
	private String userId;
	@NotNull
	private String user_password;  
	@NotNull
	private String email;
	
	private String addres;		
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(int user_pk, String first_name, String last_name, int age, String gender, String userId,
			String user_password, String email, String addres) {
		super();
		this.user_pk = user_pk;
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.gender = gender;
		this.userId = userId;
		this.user_password = user_password;
		this.email = email;
		this.addres = addres;
	}
	@Override
	public String toString() {
		return "Registration [user_pk=" + user_pk + ", first_name=" + first_name + ", last_name=" + last_name + ", age="
				+ age + ", gender=" + gender + ", userId=" + userId + ", user_password=" + user_password + ", email="
				+ email + ", addres=" + addres + "]";
	}
	public int getUser_pk() {
		return user_pk;
	}
	public void setUser_pk(int user_pk) {
		this.user_pk = user_pk;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	 
	
	    
}
