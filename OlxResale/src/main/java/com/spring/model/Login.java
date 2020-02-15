package com.spring.model;

public class Login {
private String user_Id;
private String user_password;
public Login() {
	super();
	// TODO Auto-generated constructor stub
}
public Login(String user_Id, String user_password) {
	super();
	this.user_Id = user_Id;
	this.user_password = user_password;
}
@Override
public String toString() {
	return "Login [user_Id=" + user_Id + ", user_password=" + user_password + "]";
}
public String getuser_Id() {
	return user_Id;
}
public void setuser_Id(String user_Id) {
	this.user_Id = user_Id;
}
public String getUser_password() {
	return user_password;
}
public void setUser_password(String user_password) {
	this.user_password = user_password;
}
}
