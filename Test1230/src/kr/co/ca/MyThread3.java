package kr.co.ca;

public class MyThread3 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread �۾� ��.");
		while (true) {
			System.out.println(getName());
			System.out.println("Thread �۾� ��..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
