package com.naver;

public class Test {

	private int a;
	private int b;
	private int c;
	
	
	// ����ƽ �ʱ�ȭ
	public static int d;
	
	static{
		Test.d = 100;
	}
	
	//�ν��Ͻ� �ʱ�ȭ
	{
		a = 10;
		System.out.println("��ü ����");
	}
	
	
	public Test() {

	}
	
	public Test (int b, int c) {
		this.b = b;
		this.c = c;
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	
	
	
}
