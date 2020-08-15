package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class SumUniqueElements {
	public static void main(String[] args) {

		int sum = 0;
		Integer[] strArr = { 1, 2, 5, 5, 6, 6, 7, 2 };
		List<Integer> tmpList = Arrays.asList(strArr);
		TreeSet<Integer> unique = new TreeSet<Integer>(tmpList);
		System.out.println(unique);
		for (Integer integer : unique) {
			
			sum=sum+integer;
		}
		System.out.println(sum);
	}
}
