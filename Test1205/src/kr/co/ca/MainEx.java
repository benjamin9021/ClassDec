package kr.co.ca;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// main()���� TestŬ������ �̿��ؼ� t1��ü�� ����.
		// �����ڴ� �ƹ��ų� ����ϼ���.
		// t1�� ���� �ִ� a���� �����ͼ� ����ϼ���.
		
		Test t1 = new Test(3, 8);
		int a = t1.getA();
		System.out.println(a);
		
		System.out.println(Test.d);

		
	}

}
