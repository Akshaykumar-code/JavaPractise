package com.hackerrank;

public class BreakingTheRecords {
	
	public static void main(String[] args) {
		int[] arr = {10, 5, 20, 20, 4,5, 2, 25, 1};
		
		int ls =arr[0];
		int hs =arr[0];
		int max=0;
		int min=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>hs) {
				hs=arr[i];
				max++;
			}else if(arr[i]<ls) {
				ls=arr[i];
				min++;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}

}
