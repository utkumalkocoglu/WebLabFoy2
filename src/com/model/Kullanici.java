package com.model;

public class Kullanici {
	private int userID;
	private String password;
	
	public Kullanici() {
		super();
	}
	
	public Kullanici(int userID, String password) {
		super();
		this.userID = userID;
		this.password = password;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
