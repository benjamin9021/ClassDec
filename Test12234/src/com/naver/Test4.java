package com.naver;

public class Test4 {

	public void me1() {
		new Command() {
			
			@Override
			public void execute() {
				System.out.println("��¥ �͸��� ���� Ŭ����");
			}
		}.execute();
	}
	
	public Command com = new Command() {
		
		@Override
		public void execute() {
		System.out.println("overriding");	
		}		
	};
	
}
