package com.naver;

public class Smartphone implements Phone, Camera, Cam, PC, Game { // ���߻�ӿ� ���� ���

	@Override
	public void call(String number) {
		
		System.out.println(number+"�� ��ȭ�� �̴ϴ�.");
		
	}

	
	
	
	
}
