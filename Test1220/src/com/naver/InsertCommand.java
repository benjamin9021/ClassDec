package com.naver;


import java.util.Scanner;

public class InsertCommand implements Command{  // Ŀ�ǵ带 ����

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("ID�� �Է��ϼ���.");
		String id = sc.nextLine();
		
		System.out.println("Name�� �Է��ϼ���.");
		String name = sc.nextLine();
		
		System.out.println("Age�� �Է��ϼ���.");
		int age = sc.nextInt();
		sc.nextLine();   // ����Ű ���Ḧ ���ؼ� �ݵ�� nextline�޼��带 �Է��ؾ��Ѵ�.
	
		MemberDTO dto = new MemberDTO(id, name, age);
		
		MemberDAO dao = new MemberDAO();
		dao.insert(dto);
		
	} 

}
