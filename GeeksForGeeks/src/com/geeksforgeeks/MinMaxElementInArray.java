/*https://www.geeksforgeeks.org/program-find-minimum-maximum-element-array/
*/
package com.geeksforgeeks;

public class MinMaxElementInArray {
	
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 45, 3, 2, 9, 7, 3 };
		int min=arr[0];
		int max=arr[0];
		for(int i =0; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum value of arr "+max);
		System.out.println("Minimum value of arr "+min);
	}
	

}
