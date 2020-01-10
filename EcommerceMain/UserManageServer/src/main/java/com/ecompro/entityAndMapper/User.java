package com.ecompro.entityAndMapper;

public class User {
	private String userid;
	private String tel;
	private String password;
	private String ortherinfo;

	public String getUserId() {
		return userid;
	}

	public void setUserId(String userid) {
		this.userid = userid;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOrtherInfo() {
		return ortherinfo;
	}

	public void setOrtherInfo(String ortherinfo) {
		this.ortherinfo = ortherinfo;
	}
}
