package kr.co.ca;

import java.util.Calendar;
import java.util.Scanner;

public class MainEx {

	public void me1 (Scanner sc) {  	// ���� = �⵵ % 4 == 0 && �⵵ % 100 != 0  �Ǵ� �⵵ % 400 == 0
		System.out.println("���� �Է��ϼ���.");
		int month = sc.nextInt();
		sc.nextLine();
		
		month = month -1 ;
	
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, month);
		int date = c.getActualMaximum(Calendar.DATE);
		System.out.println(date);
	}
	
	public static void main(String[] args) {
		
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
//		
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH);
//		int date = cal.get(Calendar.DATE);
//		System.out.println(year);
//		System.out.println(month);
//		System.out.println(date);
//		
//		int day = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println(day);
//		
//		cal.set(Calendar.YEAR, 2018);
//		cal.set(Calendar.MONTH, 1);
//		int year2 = cal.get(Calendar.YEAR);
//		int month2 = cal.get(Calendar.MONTH);
//		int date2 = cal.get(Calendar.DATE);
//		System.out.println(year2);
//		System.out.println(month2);
//		System.out.println(date2);
//
//		int day2 = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println(day2);
//		
//		int monthday = cal.getActualMaximum(Calendar.DATE);
//		System.out.println(monthday);
		
	}

}
