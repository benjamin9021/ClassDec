package com.naver;

public class Test3 {
	
	
	public void me6() {
		int[] arr = new int[20];
		arr[0]=1;
		arr[1]=1;
		
		for(int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public void me5() {
		int[][][][] arr = new int[4][2][1][3];
		
		for(int[][][] x : arr) {
			for(int[][] y : x) {
				for(int[] z : y) {
					for(int a : z) {
						System.out.println(a);
					}
				}
			}
		}
	}
	
	
	
	//4x5 �迭�� ���� ��Ұ���
	//10~14������ �����̴�.
	//�� ������ ��ȯ��Ű��
	// ������Ұ��� �Է��ϼ���.
	// arr

	public void me4() {
		int[][] arr = {
				{10,11,12,13,14},
				{10,11,12,13,14},
				{10,11,12,13,14},
				{10,11,12,13,14}
		};
		int[][] arr2 = new int[4][5];
	}
	
	public void me3() {
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] arr2 = new int[3][3];
	}
	
	public void me2() {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,0,3,4};
		int[] arr3 = {4,1,6,7};
		
		//2���� �迭 arr�� arr1~arr3�� �̿��ؼ� ����ÿ�
		
		int[][] arr = {arr1, arr2, arr3};
		
		int[][] ar = new int[3][4];
		
	}

	public void me1() {
		
		int a = 10;
		int b = 20;
		int c = 3;
		int d = 11;
		
		int[] arr = { a, b, c, d};
	
	
	}
	
}
