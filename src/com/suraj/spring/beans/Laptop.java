package com.suraj.spring.beans;

import org.springframework.beans.factory.annotation.Required;

public class Laptop {
	
	private Integer modelId;
	private String modelName;
	
	public Integer getModelId() {
		return modelId;
	}
	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}
	public String getModelName() {
		return modelName;
	}
	@Required
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
}
