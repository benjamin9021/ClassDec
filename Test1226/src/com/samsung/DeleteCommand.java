package com.samsung;

import java.util.Scanner;

public class DeleteCommand implements Commnad {

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ id �Է�");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		dao.delete(id);
		
	}

}
