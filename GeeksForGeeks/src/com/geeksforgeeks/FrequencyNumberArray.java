/*https://www.geeksforgeeks.org/find-frequency-number-array/
*/
package com.geeksforgeeks;

import java.util.Iterator;

public class FrequencyNumberArray {

	public static void main(String[] args) {
		/*
		 * algo 1. find the multiples of numbers in first array
		 */
		int[] arr = {2,6};
		for (int i = 0; i < arr.length; i++) {
		
			
			int[] arrNew = null;
			for (int j = 1; j < 100; j++) {
				arrNew[j] = arr[i] *j ;
			}
		}
	}
}
