package com.naver;

import java.util.Comparator;

public class MemberAgeASC implements Comparator<MemberDTO> {

	@Override
	public int compare(MemberDTO o1, MemberDTO o2) {

		if (o1.getAge() > o2.getAge()) {
			return 1;
		}else {
			return -1;
		}
	}

	
}
