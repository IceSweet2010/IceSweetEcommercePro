package com.ecompro.model;

public class ComShowModel {
	private String shopid;
	private String categoryid;
	private String comid;
	private String showphoto;// 展示照片的url
	private String shortmsg;// 商品简介

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

	public String getShowphoto() {
		return showphoto;
	}

	public void setShowphoto(String showphoto) {
		this.showphoto = showphoto;
	}

	public String getShortmsg() {
		return shortmsg;
	}

	public void setShortmsg(String shortmsg) {
		this.shortmsg = shortmsg;
	}
}
