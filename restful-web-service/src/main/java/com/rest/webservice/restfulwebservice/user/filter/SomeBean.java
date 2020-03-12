package com.rest.webservice.restfulwebservice.user.filter;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("SomeBeanFilter")
public class SomeBean {
	

	public String field1;
	public String field2;
	public String field3;
	
	public SomeBean(String value1, String value2, String value3) {
		
		this.field1 = value1;
		this.field2 = value2;
		this.field3 = value3;
		// TODO Auto-generated constructor stub
	}

	public String getField1() {
		return field1;
	}
	
	public void setField1(String value1) {
		this.field1 = value1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String value2) {
		this.field2 = value2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String value3) {
		this.field3 = value3;
	}
	
	
	
	

}
