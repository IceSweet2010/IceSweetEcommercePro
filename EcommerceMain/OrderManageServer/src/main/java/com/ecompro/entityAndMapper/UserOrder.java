package com.ecompro.entityAndMapper;

import java.math.BigDecimal;
import java.util.Date;

public class UserOrder {
	private String orderid;
	private String userid;
	private String comid;
	private String selectedparas;
	private int quantity;
	private String address;
	private String recipient;
	private String recipientphone;
	private BigDecimal cost;
	private Date orderdate;

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getRecipientphone() {
		return recipientphone;
	}

	public void setRecipientphone(String recipientphone) {
		this.recipientphone = recipientphone;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
}
