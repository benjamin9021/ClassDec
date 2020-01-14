package kr.co.ca;

import java.util.Scanner;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.GetListCommand;
import com.naver.GetMemberDTOByIdCommand;
import com.naver.InsertCommand;
import com.naver.UpdateCommand;

public class MainEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Command[] com = {new InsertCommand()
						,new GetListCommand()
						,new GetMemberDTOByIdCommand()
						,new UpdateCommand()
						,new DeleteCommand()
						};
		boolean isTure = true;
		while (isTure) {
			System.out.println("0: ���, 1: ��ü ��ȸ, 2: ȸ�� ��ȸ, 3: ȸ�� ����, 4: ȸ�� ����, 5: ����");
			int menu = sc.nextInt();
			sc.nextLine(); // �ݵ�� �������Ḧ ���� nextLine() �Է��� ��!
			
			if (menu != com.length) {
				Command c = com[menu];
				if (c != null) {
					c.execute(sc);
				}
//				com[menu].execute(sc);  
			}else {
				isTure = false;
			}
		}
		sc.close();
	}
}
