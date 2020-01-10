package com.ecompro.model;

import java.util.List;

public class EvaluationModel {
	private String shopid;
	private String categoryid;
	private String comid;
	private List<EvaluationContentModel> evaluations;

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

	public List<EvaluationContentModel> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<EvaluationContentModel> evaluations) {
		this.evaluations = evaluations;
	}
}
