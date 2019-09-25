package com.bv.model;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String execute() throws Exception {
		System.out.println("hello" +getName());
		return SUCCESS;
	}
	
}
