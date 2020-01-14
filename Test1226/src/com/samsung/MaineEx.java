package com.samsung;

import java.util.Scanner;

public class MaineEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Commnad[] com = {new InsertCommand()
						,new GetListCommand()
						,new GetMemberDTOByIdCommand()
						,new UpdateCommand()
						,new DeleteCommand()
		};
		
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("0: ���, 1: ��ü��ȸ, 2: ȸ����ȸ, 3: ����, 4: Ż��, 5: ���� ");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu != com.length) {
				Commnad c = com[menu];
				if (c != null) {
					c.execute(sc);
				}
			}else {
				isTrue = false;
			}
		}
		sc.close();
	}
}
