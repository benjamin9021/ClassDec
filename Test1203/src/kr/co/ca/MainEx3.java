package kr.co.ca;

public class MainEx3 {

	public static void main(String[] args) {
		
		String test1 = "  I love school.  ";
		String test2 = "  I like school.";
		String test3 = "I hate school.html";
		String test4 = "java#jsp#servlet#spring";
		
		System.out.println(":::::::::::::::::::::");
		System.out.println(test1);
		System.out.println(":::::::::::::::::::::");
		
		// 1.test1 ��ü�� trim()�޼��带 �̿��Ͽ� test1 ��ü�� �¿� �� ������ ������ ��
		// �̸� msg ������ ������ �� ����Ͻÿ�.
		
		String msg = test1.trim();
		System.out.println(msg);
		
		System.out.println(":::::::::::::::::::::");
		
		// 2. test1 ��ü�� indexOf()�޼��带 �̿��Ͽ� test1 ��ü�� ���� I�� �ε����� 
        // idx ������ ������ �� ����Ͻÿ�
				
		int idx  = test1.indexOf('I');
		System.out.println(idx);
		
		System.out.println(":::::::::::::::::::::");
		
		// 3. test3 ��ü�� equals()�޼��带 �̿��Ͽ� test3 ��ü�� test2 ��ü�� ������ ��ü����
        // ���θ� Ȯ���Ͻÿ�.
		
		boolean a = test3.equals(test2);
		System.out.println(a);
		
		System.out.println(":::::::::::::::::::::");
	
		// 4. test2 ��ü�� contains()�޼��带 �̿��Ͽ�
        // test2 ��ü�� ���� s�� ����ִ��� Ȯ���Ͻÿ�.

		
		boolean b = test2.contains("s");
		System.out.println(b);
		
		System.out.println(":::::::::::::::::::::");
		
		// 5. test1 ��ü�� length()�޼��带 �̿��Ͽ�
        // test1 ��ü�� ���̸� ����Ͻÿ�.

		
		System.out.println(test1.length());
		
		System.out.println(":::::::::::::::::::::");
		
		// 6. test3 ��ü�� startWith()�޼��带 �̿��Ͽ�
        // test3 ��ü�� I�� �����ϴ��� ���θ� Ȯ���Ͻÿ�.

		
		boolean c = test3.startsWith("I");
		System.out.println(c);
		
		System.out.println(":::::::::::::::::::::");
		
		// 7. test3 ��ü�� endWith()�޼��带 �̿��Ͽ�
        // test3 ��ü�� ���� html���� Ȯ���Ͻÿ�. 
		
		boolean d = test3.endsWith("html");
		System.out.println(d);
		
		System.out.println(":::::::::::::::::::::");
		
		// 8. test4 ��ü�� split()�޼��带 �̿��Ͽ� test4 ��ü��
		// #�� �������� �ܾ���� �и��Ͽ� arr ������ �����Ͻÿ�.
		
		String[] arr = test4.split("#");
		System.out.println(arr);
		
		System.out.println(":::::::::::::::::::::");
		
		// 9. test3 ��ü�� replace()�޼��带 �̿��Ͽ� test3 ��ü�� hate�� miss�� �����Ͻÿ�.
		
		test3 = test3.replace("hate", "miss");
		System.out.println(test3);
		
		System.out.println(":::::::::::::::::::::");
		
		// 10. test1 ��ü�� toUpperCase()�޼��带 �̿��Ͽ�  test1 ��ü��
		// ��� �빮�ڷ� ������ �� msg ������ ������ �Ŀ� ����Ͻÿ�.
		
		String msg1 = test1.toUpperCase();
		System.out.println(msg1);
		
		System.out.println(":::::::::::::::::::::");
		
		// 11. msg ��ü�� toLowerCase()�޼��带 �̿��Ͽ� msg ��ü�� 
		// ��� �ҹ��ڷ� ������ �� msg ������ ������ �Ŀ� ����Ͻÿ�.
		
		msg1 = msg1.toLowerCase();
		System.out.println(msg1);
		
		System.out.println(";;;;;;;;;;;;;;;;;;;;;");
	
	
	}

}
