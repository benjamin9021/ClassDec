package com.naver;

public class Test4 {
	
	/* score�� 90�� �̻��̸� '��'
	 * score�� 80�� �̻��̸� '��'
	 * score�� 70�� �̻��̸� '��'
	 * score�� 60�� �̻��̸� '��'
	 * score�� 60�� �̸��̸� '��'
	 * ����ϰ� �Ͻÿ�.
	 */
	
	public void test(int score) {
		char answer = score >= 90? '��':
					  score >= 80? '��':
					  score >= 70? '��':
					  score >= 60? '��': '��';
		System.out.println(answer);
	}
	
	public void me4(int a, int b) {
		int c = a == b? 4 : ki(a,b);
	}
	
	
	private int ki(int a, int b) {
		return a > b ? 5 : -1;
	}


	public void me3() {
		// ������ = ���ǽ�? ����:������;
		/* c�� ���� �ʱ�ȭ �� ��, 
		     ���׿�����(=���ǿ�����)�� �̿��Ͽ�
		     ���� ���Ϸ��� �Ѵ�.
		     ���� : a > b
		     �� : 400 
		     ������ : -1*/
		
		int a = 10;
		int b = 20;
		
		int c = a > b? 400 : -1;
		System.out.println(c);
		
	}
	
	
	
	public void me2(int num, int n) {
		System.out.println(num << n);
	
	}
	
	public void me1(int num, int n) {
		System.out.println(num >> n);

		
	}

}
