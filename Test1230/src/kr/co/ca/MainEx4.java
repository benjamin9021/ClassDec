package kr.co.ca;

public class MainEx4 {

	public static void main(String[] args) {

		MyThread2 mt1 = new MyThread2("�̼���");
		MyThread2 mt2 = new MyThread2("������");
		MyThread2 mt3 = new MyThread2("���");
		
		mt1.start();
		mt2.start();
		mt3.start();
		
		
//		Thread t = Thread.currentThread();
//		String name = t.getName();
//		System.out.println(name);
	}
	
}
