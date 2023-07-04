package com.greatLearning.CodingChallenge;

import java.util.Scanner;

import com.greatLearning.Services.SearchImplementation;

public class Driver {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		
		SearchImplementation obj = new SearchImplementation();
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the values of the array: ");
		for(int i=0;i< size;i++)
		{
			arr[i] = sc.nextInt(); 
		}
		System.out.println("Enter the total number of targets that needs to be achieived ");
		int targetno = sc.nextInt(); 
		
		while (targetno--!=0)
		{
			long target;
			System.out.println("Enter the input of target value ");
			target = sc.nextInt();
		    obj.search(arr,target,size);	
		}
	}

}
