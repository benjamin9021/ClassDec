package kr.co.ca;

import com.naver.MemberDTO;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberDTO dto1 = new MemberDTO();
		
		String id = dto1.getId();
		
		System.out.println(id);
		
		System.out.println(":::::::::::");
		
		dto1.setName("ȫ�浿");
		
		String name = dto1.getName();
					
		System.out.println(name);
		
		
	}
	
}
