package com.ecompro.model;

import java.util.List;

public class ListOfCartModel {
	private String userid;
	private List<String> cartids;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public List<String> getCartids() {
		return cartids;
	}

	public void setCartids(List<String> cartids) {
		this.cartids = cartids;
	}
}
