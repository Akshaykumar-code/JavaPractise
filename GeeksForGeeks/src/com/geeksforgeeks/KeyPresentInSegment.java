/*https://www.geeksforgeeks.org/check-if-a-key-is-present-in-every-segment-of-size-k-in-an-array/
*/
package com.geeksforgeeks;

public class KeyPresentInSegment {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 45, 3, 2, 9, 7, 3 };
		int s = 3;
		int count = 0;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			count++;
			if (arr[i] == s) {
				flag = true;
			}
			if (count % 3 == 0) {
				if (flag && i != (arr.length-1)) {
					flag = false;
					continue;
				} else {
					break;
				}
			}
		}

		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
