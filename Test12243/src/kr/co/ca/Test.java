package kr.co.ca;

public class Test {
	
	// �ݺ����� ������� �ʰ� �־��� ���ں��� 1������ ���� ����Ͻÿ�. 
	
	public int me4(int num) {
		int result = 1;
		if (num >= 1) {
			result = num * me4(num-1);
		}else {
			result = 1;
		}
		return result;
		
	}
	
	
	// �ݺ����� ������� �ʰ� �־��� ���ں��� 1������ ���� ����Ͻÿ�.
	
	public int me3(int num) {
		int result = 0;
		if (num >=1) {
			result = num + me3(num-1);
		}else {
			result = 0;
		}
		return result;
		
	}
	
	
	public void me2(int num) { // ��� �޼��� ������ �� ���ѹݺ��� �����.
		
		if (num >=0) {
			System.out.println("hello");
			me2(num - 1);
		}
	}
	
	public void me1() { // ��� �޼��� �ڱ� �ڽſ��� �ٽ� ���ƿ´�.

		System.out.println("hello");
		me1();
	}

}
