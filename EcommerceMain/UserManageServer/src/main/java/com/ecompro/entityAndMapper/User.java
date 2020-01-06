package com.ecompro.entityAndMapper;

public class User {
	private String userID;
	private String username;
	private String password;
	private String ortherInfo;

	public User() {
		super();
	}

	public User(String userID, String username, String password, String ortherInfo) {
		super();
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.ortherInfo = ortherInfo;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOrtherInfo() {
		return ortherInfo;
	}

	public void setOrtherInfo(String ortherInfo) {
		this.ortherInfo = ortherInfo;
	}
}
