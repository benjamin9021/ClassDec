package kr.co.ca;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {

		Test t1 = new Test();
		
		t1.setId("t001");
		t1.setName("kim");
		t1.setAge(3);
		
		
		Test t2 = new Test("t002", "lee", 3);
		
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		System.out.println(t2.getAge());
		
		// t1 ��ü�� id: t001
		// t1 ��ü�� name: kim
		// ti ��ü�� age: 3
		
	}

}
