package kr.co.ca;

import java.util.ArrayList;

public class MainEx2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		
		list.add(new String("hello")); //�Է��ϰ� ���� �� add
		
		int size = list.size(); // ���� �� ������ ũ��
		System.out.println(size);
		
		String msg = list.get(0); // Ư����ü�� �������� �� 
		System.out.println(msg);
		
		list.remove(0); // Ư����ü�� ����� �� �����ϴ°�
		list.clear(); // ���δ� ����

//		list.set(index, element) ���� = replace

		list.add(new String("hello"));
		list.add(new String("world"));
		list.add(new String("bye"));
		
		size = list.size();
		System.out.println(size);
		
		String msg1 = list.get(1);
		String msg2 = list.get(2);
		System.out.println(msg1 + ":" + msg2);
		
		list.remove(2);
		list.clear();
		
		boolean co = list.contains(new String("world"));
		System.out.println(co);
		
		ArrayList<Apple> list2 = new ArrayList<Apple>();
		
		list2.add(new Apple()); // �׳� ��ü�� �־��൵ �ǰ�
		
		Apple apple1 = new Apple();
		
		list2.add(apple1); // ������ �����ؼ� �������� �־��൵ �ȴ�
		
		
		
	}

}
