package com.geeksforgeeks;

public class ReverseAnArray {


	// using method recurrsion

	public static void main(String[] args) {
		int[] cha = {1,2,3,4,5,6,7,8,9,10};
		reverse(cha, 0, cha.length - 1);
		for (int i = 0; i < cha.length; i++) {
			System.out.printf(" " + cha[i]);
		}
	}

	public static void reverse(int[] cha, int start, int end) {
		if (start != (cha.length ) / 2) {
			int temp = cha[start];
			cha[start] = cha[end];
			cha[end] = temp;
			reverse(cha, ++start, --end);
		}
	}


}
