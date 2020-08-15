package com;

import java.util.Arrays;

public class FindThirdLargestNumber {
	public static void main(String[] args) {
		int[] array = { 6, 8, 1, 9, 2, 1, 10 };
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if(array.length<3)
			{
				System.out.println("Invalid Input, array size is less than 3");
				break;
			}
			//System.out.println(array[i]);
		}
		
			
			System.out.println(array[array.length-3]);
				

	}
}