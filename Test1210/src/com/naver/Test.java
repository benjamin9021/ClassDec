package com.naver;

public class Test {
	
	// 3�� ����� �����Ű���ʴ´�
	// �׿� ���� ���� feat.continue
	
	public void me111(int a) {
		int skip =3;
		
		for (int i = 0 ; i < 10 ; i++) {
			if (i % 3 == 0 ) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public void me6() {
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public void sossu(int start, int end) {
		// sossu()�޼���� Ư�� ������ �Է¹޾Ƽ�
		// �� �ȿ� �ִ� ���鿡 ���� �Ҽ� ���θ�
		// �����ϴ� ����� ���� �ִ�.
		// �ݵ�� me5()�� Ȱ���ϼ���.
		
		for (int num = start; num < end ; num++) {
			me5(num);
			
		}
			
		
	}
	
	public void me5(int num) {
		boolean isSossu = true;
		
		for(int i = 2; i < num ; i++ ) {
			if (num % 1 == 0 ) {
				isSossu = false;
				break;
				
			}
		}
		System.out.print(num);
		if (isSossu == true) {
			System.out.println("�� �Ҽ��Դϴ�.");
		}else {
			System.out.println("�� �Ҽ��� �ƴմϴ�.");
		}
			
	}
	
	public void me5() {
	      int num = 11;

	      boolean isSossu = true;

	      for (int i = 2; i < num; i++)

	         if (num % i == 0) {
	            isSossu = false;
	            break;
	         }

	      System.out.print(num);

	      if (isSossu) {
	         System.out.println("�� �Ҽ��Դϴ�.");
	      } else {
	         System.out.println("�� �Ҽ��ƴմϴ�.");

	      }
	   }
	
	// me42() �������� ��� ���� �޼����Դϴ�.
	// me41()�� �̿��Ͽ� �������� ��� ����Ͻÿ�.
	
	public void me42() {
		for (int dan = 2; dan < 10; dan++) {
			me41(dan);
			System.out.println(dan);
		}
	}
		
	// me41() ������ �߿���
	// Ư���� ������ �Է¹޾�
	// �ش� ���� ����ϴ� �޼����Դϴ�.
	
	public void me41(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "x" + i +"="+(dan*i));
		}
	}
	
	// ������ 5����� me4
		
	public void me4() {
		int dan = 5;
		for (int i = 1; i <10; i++) {
			System.out.println(dan + "x" + i +"="+(dan*i));
		}
	}
	
	// me3()�޼���� Ư�� ������ ���� �߿���
	// ¦������ ����ϴ� �޼����Դϴ�.
	// Ư�� ������ ���ڿ� ���� ������
	// �޼��� ȣ�� �� �Էµ˴ϴ�.
	
	public void me3(int start, int end) {
		for (int i = start; i < end; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	
	// me21()�޼���� a���� z���� ����ϴ� �޼����̴�.
	
	public void me21() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
		}
	}
	
	
	
	// me2()�޼���� Ư�� ������ 100������ ���� �߿���
	// 4�� ����� ����Ͻ� �޼����̴�.
	
	public void me2(int start) {
		for (int i = start ; i < 100; i++) {
			if(i % 4 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void me0() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
		}
	}
	
	public void me12() {
		for (int i = 100; i >= 0; i--) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	
	
	public void me11() {
		// 0���� 100������ ���� ��
		// 3�� ����� ����ϼ���.
		for (int i = 0; i < 101; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	
	
	public void me1() {
		for(int i=0; i<100; i++) {
			System.out.println(i);
			System.out.println("hello world");
		}
	}
	
}
