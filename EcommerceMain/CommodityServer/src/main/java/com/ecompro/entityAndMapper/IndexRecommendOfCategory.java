package com.ecompro.entityAndMapper;

import java.util.Date;

public class IndexRecommendOfCategory {
	private String shopid;
	private String categoryid;
	private String comid;
	private String showphoto;
	private String shortmsg;
	private Date begintime;
	private Date endtime;

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

	public Date getBegintime() {
		return begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
}
