package kr.co.ca;

public class MainEx3 {

	public static void main(String[] args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("�͸��� ���� Ŭ������ �̿��ؼ� ���� Ŭ����");
			}
			
		}).start();
		
	}

}
