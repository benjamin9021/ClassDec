package kr.co.ca;

public class MainEx2 {

	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable(); // runnable ��ü
		Thread t = new Thread(mr); // thread ��ü
		t.start(); // thread ����
		
	}
	
}
