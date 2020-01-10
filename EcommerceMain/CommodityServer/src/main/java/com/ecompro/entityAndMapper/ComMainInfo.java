package com.ecompro.entityAndMapper;

import java.util.Date;

public class ComMainInfo {
	private String shopid;
	private String comid;
	private String categoryid;
	private String showphoto;
	private String shortmsg;
	private int ifrecommend;
	private Date addtime;

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

	public int getIfrecommend() {
		return ifrecommend;
	}

	public void setIfrecommend(int ifrecommend) {
		this.ifrecommend = ifrecommend;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
}
