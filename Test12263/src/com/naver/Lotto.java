package com.naver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Lotto {

	public HashSet<Integer> set = new HashSet<Integer>();

	//	Random rnd = new Random();
	//	int num = rnd.nextInt(45-1+1)+1;

	public void shuffle() {
		
		Random rnd = new Random();
		
		while (set.size()<6) {
			int num = rnd.nextInt(45 - 1 + 1) + 1;
			set.add(num);
		}
		
		System.out.println(set);
	}
	
}
