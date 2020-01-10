package com.ecompro.entityAndMapper;

import java.util.Date;

public class Shopcart {
	private String cartid;
	private String userid;
	private String comid;
	private String selectedparas;
	private int quantity;
	private Date addtime;

	public String getCartid() {
		return cartid;
	}

	public void setCartid(String cartid) {
		this.cartid = cartid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getComid() {
		return comid;
	}

	public void setComid(String comid) {
		this.comid = comid;
	}

	public String getSelectedparas() {
		return selectedparas;
	}

	public void setSelectedparas(String selectedparas) {
		this.selectedparas = selectedparas;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

}
