package com.naver;


public class Test {

	// score�� >=90 a >=80 b >=70 c >= 60 d < 60 f ��ȯ
	
	public char me6(int score) {
		char c = 0;
		if (score >= 90) {
			c = 'a';
		} else if (score >= 80){
			c = 'b';
		} else if (score >= 70) {
			c = 'c';
		} else if (score >= 60) {
			c = 'd';
		} else {
			c = 'f';
		}
		return c;
	}
	
	
	/* me51()�޼����
	 kor(��������)��  eng(��������)��
	 �Է¹޾Ƽ�
	 �� ������ ��� 60���� ����
	 sysout("�հ�")
	 �׷��� ������
	 sysout("���հ�")�� ����ϴ� �޼���*/
	
	// ## anwser
	
	// public void me51(int kor, int eng) {
	// 		double avg = (kor + eng) / 2;
	// 		if( avg >= 60 {
	// 			sysout("pass");
	// 		}else{
	// 			sysout("fail")'
	// 		}
	// }
	
	// �Ʒ� �Ŵ� ��� �� ������, ���� �ٸ� ���� �� �����Ͽ��� ���, ���� �ڵ尡 �� ����.
	// �Ʒ� ���� �� �߰��ϰ� ���� ��,  double avg�� �Ἥ �ϴ°� ����..
	// ��� ������ �ڵ带 �����ϰ� �� �� �ִ� ���� ���� �ڵ�....
	// �Ǵ�, int���� �Ѿ�� ��츦 ����ؼ�..double..
	
	public void me51(int kor, int eng) {
		if (((kor + eng) /2) >= 60) {
			System.out.println("�հ�");
	} else { 
		System.out.println("���հ�");
	}
	}
	
	
	/* me5()�޼����
	 kor(��������)��  eng(��������)��
	 �Է¹޾Ƽ�
	 �� ������ ���� 60�� �̻��� ����
	 sysout("�հ�")
	 �� �߿� �ϳ��� 60�� �̸��̸�,
	 sysout("���հ�")�� ����ϴ� �޼���*/
	
	public void me5(int kor, int eng) {
		
		if (kor >= 60 && eng >= 60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
		
	}
		
	
	// if ���ȿ� if�� �ִ� ����
	// if ���ȿ��� if���̳� ���� if���̳� if else���� �� ���� �� �ִ�.
	
	public void me4(String gen1, 
					String gen2) {
			
		// gen1 : �ֹε�ϻ� ��,
		// gen2 : ���� �� ���¿� ���� ��
		// mm 
		// ff
		// mtf
		// ftm
		
		if (gen1.equals("m")) {
			if(gen2.equals("mm")) {
				System.out.println("mm");
			}else {
				System.out.println("mtf");
			}
		} else {
			if( gen2.equals("ff")) {
			System.out.println("ff");
			} else {
			System.out.println("ftm");
		}
	}
		
		
	}
	
	
	// ===========================================================
	// ����if��
	
	public void me4(int a) {
		
		// a�� 4�� ������� ����
		// �������� ����..
		// 0�̸�, sysout("hello")
		// 1�̸�, sysout("world")
		// 2�̸�, sysout("good")
		// �׷��������� sysout("end"),
		//			sysout("bye")
		
		if ( a % 4 == 0 ) {
			System.out.println("hello");
		} else if ( a % 4 == 1) {
			System.out.println("world");
		} else if (a % 4 == 2) {
			System.out.println("good");
		} else {
			System.out.println("end");
			System.out.println("bye");
		}
		
	}

	
	// ==========================================================
	// if(){ } else {} ��
	
	public void me31(int score) {
	
		// score�� 60 �̻��̸�, sysout("pass")
		// �׷��� ������ sysout ("fail")
	
		if ( score >= 60 ) {
			System.out.println(score+"pass");
		}else {
			System.out.println(score+"fail");
		}
		
	}
	
	public void me3(int a) {
		
		// a�� ¦����, sysout("¦��")
		// �׷��� ������, sysout("Ȧ��")
		
		if ( a % 2 == 0) {
			System.out.println(a+"¦��");
		}else {
			System.out.println(a+"Ȧ��");
		}
	}
	
	
	// ======================================================
	// �ܼ� if��
	
	public void me21(int a) {

		// a�� 4�� �������� ��,
		// �������� 1�̸�
		// sysout("a�� 4�� ������ �������� 1�Դϴ�.")
		
		if( a % 4 == 1 ) {
			
			System.out.println("a�� 4�� ������ �������� 1�Դϴ�.");
		
		}

	}
	
	
	public void me2(int a) {
		
		// a�� 3�� ����̸�,
		// sysout( a + "�� 3�� ����Դϴ�.")
		// a�� 3�� ����� �ƴϸ�,
		// sysout( a + "�� 3�� ����� �ƴմϴ�.")
		
		if( a % 3 == 0 ) {
			
			System.out.println(a + "��s 3�� ����Դϴ�.");
		}
		
		if( a % 3 != 0 ) {

			System.out.println(a + "�� 3�� ����� �ƴմϴ�.");
		}
	
	}
	
	
	public void me1(int a) {
		
		if( a % 2 == 0 ) {
		
			System.out.println(a + "�� ¦��");
	
		}
		
		if( a % 2 != 0 ) {
		
			System.out.println(a + "�� Ȧ��");
		
		}
		
	}
	
}
