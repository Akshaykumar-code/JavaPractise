package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GradingProblem {
	/*
	 * Algorithm - 1. iterate the list of marks 2. check if marks is less than 38 3.
	 * if yes then print the marks 4. if marks is greated than 38 then check with
	 * multiple of 5 and if the difference is 2 5. then promote to next value or
	 * else print the value
	 */

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(73);
		list.add(67);
		list.add(38);
		list.add(33);

		for (Integer val : list) {
			if (val < 38) {
				System.out.println(val);
			} else {
				int temp = ((val / 5) * 5) + 5;
				int diff = temp - val;
				if (diff <= 2) {
					System.out.println(val + diff);
				} else {
					System.out.println(val);
				}
			}
		}
	}

}
