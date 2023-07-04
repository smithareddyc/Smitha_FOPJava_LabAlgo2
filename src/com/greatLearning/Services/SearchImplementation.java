package com.greatLearning.Services;

public class SearchImplementation {

	public void search(int arr[], long target, int size) {
		int flag = 0;
		long sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + arr[i];
			if (sum >= target) {
				System.out.println("Target acheived in " + (i+1) + "transactions");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Target not acheived ");
		}

	}
}
