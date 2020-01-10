package com.ecompro.model;

import java.util.List;

public class AddComModel {
	private String shopid;
	private String categoryid;
	private String comid;
	private List<String> photos;// 商品的照片url列表
	private String comparas;// 商品的上架参数，json格式

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

	public List<String> getPhotos() {
		return photos;
	}

	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}

	public String getComparas() {
		return comparas;
	}

	public void setComparas(String comparas) {
		this.comparas = comparas;
	}
}
