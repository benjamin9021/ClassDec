package com.naver;

public class Test2 {
	
	
	public void test5() {
		for (int i = 100; i >= 0; i--) {
			
			// if���� �̿��ؼ� i�� 3���� ������� ���� 
			// �������� ����� ������.
			System.out.println(i % 3);
								
			}
		}
	
	public void test4() {
		for (int i = 0; i < 100; i++) {
			
			// test3()�� if���� 
			// switch~case������ �����Ͻÿ�.
			
			System.out.print(i);
			
			int key = i % 2;
			switch (key) {
			case 0:
				System.out.println("�� ¦��");
				break;

			default:
				System.out.println("�� Ȧ��");
				break;
			}
		}
	}
	
	public void test3() {
		for (int i = 0; i < 100; i++) {
			
			// sysout(i="�� ¦��");
			// sysout(i="�� Ȧ��");
			// System.out.print(i); i+�� ���� �ǰԲ� �� ������.
			
			if (i % 2 == 0) {
				System.out.println(i+"�� ¦��");
			} else {
				System.out.println(i+"�� Ȧ��");
			}
					
		}
	}
	
	public void test2() {
		for (int i = 2; i < 10; i++) {
			
			//test1() �۾��� �� if���� 
			//switch~case������ ��ü�ϼ���.	
			
			int key = i % 2;
			
			switch (key) {
			case 0:
				System.out.println(i);
				break;
			}
		}
	}
	
	public void test1() {
		for (int i = 0; i < 100; i++) {
			//¦���� ����ϰ� �ϼ���.
			
			if ( i % 2 == 0) {
				System.out.println(i);
			}
			
		}
		
	}

	
	public void k4(int score) {
		int key = score/10;
		
		switch (key) {
		case 10:
		case 9:
			System.out.println("a");
			break;
		case 8:
			System.out.println("b");
			break;
		case 7:
			System.out.println("c");
			break;
		case 6:
			System.out.println("d");
			break;
		default:
			System.out.println("f");
		}
		
	}

	/*1,3,5,7,8,10,12 ==>sysout 31

		4,6,9,11 ===> sysout 30

		2 ==>28 */
	
	
	public void k3(int month) {
		
		switch (month) {
			
		case 2:
			System.out.println(28);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(30);
			break;
		default:
			System.out.println(31);
		}
	}
	
	
	
	public void k2(int key) {
		switch (key) {
		
		case 5:
			System.out.println("hello");
			break;
		case 1:
			System.out.println("ok");
			
		default:
			System.out.println("end");
			break;
		}
	}
	
	
	public void k1() {
		int key = 3;
		
		switch (key) {
		
		case 3:
			System.out.println(111);
			System.out.println(222);
			break;

		case 2:
			System.out.println(4444);
			System.out.println(5555);
			break;
		default:
			System.out.println("hello");
			break;
		}
	}

}
