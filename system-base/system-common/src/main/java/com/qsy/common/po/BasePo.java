package com.qsy.common.po;

import java.io.Serializable;

public abstract class BasePo implements Serializable{
	private static final long serialVersionUID = 5114138291184753731L;
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
