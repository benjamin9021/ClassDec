package kr.co.ca;

import com.naver.Command;

interface Dog {
	void show(String name);
}

interface Cat {
	void run(String to,String who);
}


public class MainEx {

	public static void main(String[] args) {

		Cat c1 = (String to, String who) -> {
			System.out.println();
		};
		
		Dog d1 = (String name) ->{
			System.out.print(name);
			System.out.println("(��)�� ���� ��ϴ�.");
		};
		
		d1.show("happy");
		
		Command insert = () ->{
			System.out.println("ȸ�� ������ �Է��߽��ϴ�.");
		};
		insert.execute();
		
	}
	
}
