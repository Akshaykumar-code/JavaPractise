package com.hackerrank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SubarrayDivision {

	public static void main(String[] args) {

		int d = 4;

		
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);
		
		int count = 0;
		int m = 2;

		for (int i = 0; i+(m-1) < list.size(); i++) {
			int sum=0;
			int temp = i+(m-1);
			while(temp>=i) {
				sum +=list.get(temp);
				--temp;
			}
			if(sum==d)
			{
				count++;
			}
		}

		System.out.println(count);
	}

}
