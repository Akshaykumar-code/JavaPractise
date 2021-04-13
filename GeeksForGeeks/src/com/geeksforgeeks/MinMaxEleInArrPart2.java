/*https://www.geeksforgeeks.org/program-find-minimum-maximum-element-array/
*/

package com.geeksforgeeks;

public class MinMaxEleInArrPart2 {
//sorting way
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 45, 3, 2, 9, 7, 3 };
		int temp ;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(i<(arr.length-1) && arr[j]<arr[i]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
			
		}
		System.out.println("Maximum value of arr "+arr[arr.length-1]);
		System.out.println("Minimum value of arr "+arr[0]);
	}
}
