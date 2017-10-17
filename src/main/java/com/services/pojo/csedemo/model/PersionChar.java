package com.services.pojo.csedemo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PersionChar {

	@Value("${acmeair.person.sex:man}")
	private String sex;

	public String getSex() {
		
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
