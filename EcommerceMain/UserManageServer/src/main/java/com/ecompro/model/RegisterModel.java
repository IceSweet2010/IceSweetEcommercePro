package com.ecompro.model;

public class RegisterModel {
	private String username;
	private String password;
	private String ortherInfo;

	public RegisterModel() {
		super();
	}

	public RegisterModel(String username, String password, String ortherInfo) {
		super();
		this.username = username;
		this.password = password;
		this.ortherInfo = ortherInfo;
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
