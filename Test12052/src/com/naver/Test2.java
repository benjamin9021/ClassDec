package com.naver;

public class Test2 {
	
	// ls6() �޼���� �ΰ��� dog �����͸� �Ѱܹ޾�
	// �Ȱ����� ���ο� ���� ����� ��ȯ�ϴ� �޼����Դϴ�. 

	public boolean ls6(Dog a, Dog b) {
		boolean result = a != b;
		return result;
	}
	
	
	// ls5() �޼���� �ϳ��� �����͸� �Ѱܹ޾Ƽ�
	// 3,4�� ������ ���θ� ����ϴ� �޼����Դϴ�. 

	public void ls5(double a) {
		System.out.println(a == 3.4);
	}
	
	// ls4() �޼���� �ϳ��� �����͸� �Ѱܹ޾Ƽ�
	// 3.4f���� �۰ų� ������ ���θ�
	// ��ȯ�ϴ� �޼����Դϴ�...

	public boolean ls4(float a) {
		boolean result = a <= 3.4f;
		return result;
	}
	
	// ls3() �޼���� �ΰ��� long ������ �Ѱܹ޾�
	// ù��° ���ڰ� �ι�° ���ں��� 
	// ������ ���θ� �˷��ִ� �޼����̴�.
	// �� ����� ����Ͻÿ�.
		
	public void ls3(long e, long f) {
		boolean result =  e < f;
		System.out.println(result);
	}
	
	// ls2()�޼���� �ΰ��� byte ������ �Ѱܹ޾�
	// ù��° ���ڰ� �ι�° ���ں��� 
	// ũ�ų� ������ ���θ� �˷��ִ� �޼����̴�.
	// �� ����� ��ȯ�Ͻÿ�.
		
	public boolean ls2(byte c, byte d) {
		boolean result = c >= d;
		return result;
		
	}
		
	// ls1() �޼���� �� ���� int �� ���� �Ѱܹ޾�
	// ù��° ���ڰ� �ι�° ���ں��� 
	// ū�� ���θ� �˷��ִ� �޼����̴�.
	// �� ����� ����Ͻÿ�.
		
	public void ls1(int a, int b) {
		boolean result = a > b ;
		System.out.println(result);
	}
	
	

}
