package com.samsung;

import java.util.Scanner;

public class InsertCommand implements Commnad {

	@Override
	public void execute(Scanner sc) {
		System.out.println("id�Է�");
		String id = sc.nextLine();
		System.out.println("name�Է�");
		String name = sc.nextLine();
		System.out.println("age�Է�");
		int age = sc.nextInt();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO(id, name, age);
		dao.insert(dto);
		
		
	}

}
