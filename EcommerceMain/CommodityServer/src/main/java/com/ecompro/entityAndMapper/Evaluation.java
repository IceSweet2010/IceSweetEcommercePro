package com.ecompro.entityAndMapper;

public class Evaluation {
	private String orderid;
	private String shopid;
	private String comid;
	private String categoryid;
	private int goodlevel;
	private String evaluations;

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getShopid() {
		return shopid;
	}

	public void setShopid(String shopid) {
		this.shopid = shopid;
	}

	public String getComid() {
		return comid;
	}

	public void setComid(String comid) {
		this.comid = comid;
	}

	public String getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}

	public int getGoodlevel() {
		return goodlevel;
	}

	public void setGoodlevel(int goodlevel) {
		this.goodlevel = goodlevel;
	}

	public String getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(String evaluations) {
		this.evaluations = evaluations;
	}
}
