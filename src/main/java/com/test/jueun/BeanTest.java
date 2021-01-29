package com.test.jueun;

import org.springframework.stereotype.Component;

//@Component
public class BeanTest {
	
	private String name;
	
	public BeanTest() {
		// TODO Auto-generated constructor stub
	}

	public BeanTest(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
