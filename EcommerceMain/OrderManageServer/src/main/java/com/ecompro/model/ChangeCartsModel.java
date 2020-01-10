package com.ecompro.model;

import java.util.List;

public class ChangeCartsModel {
	private String userid;
	private List<CartidAndNewnum> cartlist;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public List<CartidAndNewnum> getCartlist() {
		return cartlist;
	}

	public void setCartlist(List<CartidAndNewnum> cartlist) {
		this.cartlist = cartlist;
	}
}

class CartidAndNewnum {
	private String cartid;
	private int newnum;

	public String getCartid() {
		return cartid;
	}

	public void setCartid(String cartid) {
		this.cartid = cartid;
	}

	public int getNewnum() {
		return newnum;
	}

	public void setNewnum(int newnum) {
		this.newnum = newnum;
	}
}