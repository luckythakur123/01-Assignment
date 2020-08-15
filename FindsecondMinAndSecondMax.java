package com;

import java.util.Arrays;

class FindsecondMinAndSecondMax {
	public static void main(String[] args) {

		int[] array = { 1, 2, 5, 9, 6, 4, 7, 2 };
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			 //System.out.println(array[i]);
		}
		
		System.out.println("Second Min : "+array[1]);
		System.out.println("Second Max : "+array[array.length - 2]);

	}
}
