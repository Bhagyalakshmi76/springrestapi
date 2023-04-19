package com.restapicrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_table")
public class User {

	@Id
	private int id;
	private String userName;
	private String userEmail;
	private String userAddress;
	public User() {
		super();
		
	}
	public User(int id, String userName, String userEmail, String userAddress) {
		super();
		this.id = id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userEmail=" + userEmail + ", userAddress=" + userAddress
				+ "]";
	}
	
	
}
