package com.naver;

public class Car extends Object{
	
	private String company;
	
	public Car() {	
		
	}

	public Car(String company) {
		super();
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public void stop() {
			System.out.println("�ڵ����� �����մϴ�.");
	}
	
	
}
