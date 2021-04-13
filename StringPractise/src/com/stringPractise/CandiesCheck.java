package com.stringPractise;

public class CandiesCheck {
	
	public static void main(String[] args) {
		int[] arr = {2,4,2,6,1,7,8,9,2,1};
		int n=10;
		
		
		 int[] candies = new int[n];
		  candies[0] = 1;
		  for (int i = 1; i < n; i++) {
		    if (arr[i] > arr[i - 1]) {
		      candies[i] = candies[i - 1] + 1;
		    } else {
		      candies[i] = 1;
		    }
		  }

		  for (int i = n - 2; i >= 0; i--) {
		    if (arr[i] > arr[i + 1] && candies[i] <= candies[i + 1]) {
		      candies[i] = candies[i + 1] + 1;
		    }
		  }

		  long sum = 0;
		  for (int c : candies) {
		    sum += c;
		  }
		 System.out.println(sum);
	}

}
