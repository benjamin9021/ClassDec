package com.naver;

public class Test3 {

	public int me4(int num) {
		
		try {
			System.out.println(4 / num);
			return 4/num;
		} catch (Exception e) {
			return -1;
		}finally {
			System.out.println("����ϼ̽��ϴ�.");
		}
		
	}
	
	public void me3(int num) throws Exception{
		try {
			System.out.println(4/num);
		} finally {
			System.out.println("�� ���� �̿��ؼ��ּż� �����մϴ�.");	
		}
	}
	
	public void me2(int num) throws Exception{
		System.out.println(5/num);
	}
	
	public void me1(int num) {
		try {
			System.out.println(5 / num);
		} catch (Exception e) {
			System.out.println("���� �߸��ƴ�.");
		}finally {
			System.out.println("�̿��ؼ��ּż� �����մϴ�.");	
		}
		
	}
	
}
