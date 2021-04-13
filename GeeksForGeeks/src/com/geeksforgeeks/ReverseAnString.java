package com.geeksforgeeks;

import java.util.Iterator;

public class ReverseAnString {

	// using method recurrsion

	public static void main(String[] args) {
		String s = "shweta";
		char[] cha = s.toCharArray();
		reverse(cha, 0, cha.length - 1);
		for (int i = 0; i < cha.length; i++) {
			System.out.printf(" " + cha[i]);
		}
	}

	public static void reverse(char[] cha, int start, int end) {
		if (start != (cha.length ) / 2) {
			char temp = cha[start];
			cha[start] = cha[end];
			cha[end] = temp;
			reverse(cha, ++start, --end);
		}
	}
}
