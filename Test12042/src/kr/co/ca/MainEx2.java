package kr.co.ca;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test5;

public class MainEx2 {

	public static void main(String[] args) {
		
		//Test Ŭ������ �̿��ؼ� t1 ��ü�� ������� �Ѵ�.
		// ����� �����ڸ� �̿��ϼ���. (�Ķ���Ͱ� 3��¥��..)
		
		Test t1 = new Test("m001", "park", 4);
		
		// Test2 Ŭ������ �̿��Ͽ� ��ä�� t2�� �����ϵ�
		// �����ڴ� �Ķ���Ͱ� 2���� ���� ����Ͻÿ�.
		// �Ķ������ �ڷ��� ������ int, Test�Դϴ�.
		
		Test2 t2 = new Test2(6,t1);
		
		// Test3 Ŭ������ �̿��Ͽ� ��ä  t3�� �����ϵ�
		// ����� �����ڸ� �̿��Ͽ� ����ÿ�.
		// ��ü t31 �־��� �����ʹ� "kim", 'c' ���Դϴ�.		
		
		Test3 t3 = new Test3("lee", 3, true, 'd');
		 
		Test3 t31 = new Test3("kim", 0, false,'c');
		
		// Test5 Ŭ������ �̿��Ͽ� ��ä t5�� �����ϵ�
		// ����� �����ڸ� �̿��Ͽ� ����ÿ�.
		
		int[] arr = new int[4];
		
		Test5 t5 = new Test5(new StringBuffer("hello"), arr, false);
		
		
		
	}

}
