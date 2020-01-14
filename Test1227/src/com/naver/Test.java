package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test {
	
	public void me8() {
		HashMap<String,ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		ArrayList<String> objinfo = new ArrayList<String>();
		objinfo.add("������Ʈ");
		objinfo.add("���");
		objinfo.add("�μ�ȸ�α���");
		objinfo.add("���ø����̼�");
		objinfo.add("��ǰ�˻�");
		map.put("��ǰ����", objinfo);
		System.out.println(map);
	}
		
	
	public void me7() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 97);
		map.put("b", 98);
		map.put("c", 99);
		map.put("d", 100);
		map.put("e", 101);
		map.put("f", 102);
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key+":"+map.get(key));
		} 
//		�Ʒ� �ڵ�� ���� �ڵ带 �����ϰ� �� ��.
//		Iterator<String> keys = map.keySet().iterator();
//		while (keys.hasNext()) {
//			String key = keys.next();
//			System.out.println(key+":"+map.get(key));
//		} 
	}
	
	public void me6() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		map.put("f", 6);
		
		int a = map.get("a");
		System.out.println(a);
		System.out.println(map);  // �߰�ȣ�� �ֱ� ���ؼ�
		map.remove("a");  // remove�� �ϳ��� �����͸� ����
		System.out.println(map);
		map.clear(); // ��� �����͸� ����
		System.out.println(map);
	}
	
	public void me5() {  // �ϱ�~! �� ���·� ���� ���δ�. 
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		ArrayList<String> tvlist = new ArrayList<String>();
		tvlist.add("qled");
		tvlist.add("oled");
		tvlist.add("led");
		ArrayList<String> countrylist = new ArrayList<String>();
		countrylist.add("korea");
		countrylist.add("usa");
		countrylist.add("china");
		
		map.put("tv", tvlist);
		map.put("country", countrylist);
		
		System.out.println(map);
	}
	
	public void me4() {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("tv", "qled");
		map.put("tv", "oled");
		map.put("tv", "led");
		
		map.put("country", "korea");
		map.put("country", "usa");
		map.put("country", "china");  
		
		String tv = map.get("tv");  // ���� ������ �������� led�� �����ɴϴ�..
		String country = map.get("country");  // ���� ������ �����͸� �����ɴϴ�..
		
		System.out.println(tv);
		System.out.println(country);
	}
	
	public void me3() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("grade1", 1);
		map.put("grade1", 2);
		map.put("grade1", 3);
		map.put("grade1", 4);
		
		map.put("grade2", 5);
		map.put("grade2", 6);
		map.put("grade2", 7);
		map.put("grade2", 8);
		map.put("grade2", 9);
		
		int size = map.size();
		System.out.println(size);
		System.out.println(map);   // key�� �Ȱ����� ������ �����̰�, ���ο� ���� ������ �Է�.
	}
	
	public void me2() {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("car", "bmw"); // put �����͸� �־��� �� ���ȴ�
		map.put("car", "sm5");
		map.put("car", "sonata");
		map.put("tv", "Qled");
		map.put("tv", "oled");
		map.put("phone", "gal");
		map.put("phone", "g");
	}

	public void me1() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	}
}
