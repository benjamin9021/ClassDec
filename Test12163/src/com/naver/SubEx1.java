package com.naver;

import java.util.Scanner;

public class SubEx1 extends SuperEx {

	public void show1() {
		me1();
	}


//	SubEx1Ŭ������ me2()�� �������̵��϶�.
//	�������� ����ϴ� �������� ����ÿ�.	
//  @Override	
//  public void me2() {
//		for (int dan = 2; dan < 10; dan++) {
//			dan(dan);
//			System.out.println(dan);
//		}
//	}
		
	private void dan(int dan) {
		for (int i = 0; i < 10; i++) {
			System.out.println(dan + "x" + i + "=" + dan * i);
		}
	}



	@Override
	public void me1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		int dan = sc.nextInt();
		
		dan(dan);
		sc.close();
	}
	
	
}
