package com.ysingh.structure;

import java.util.Arrays;
import java.util.List;

public class ST04AddNumbersInList {
	
	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(12,9,13,5,4,2,4,12,15);
		
		System.out.println("Calculating Sum of All Numbers: ");
		int sum = addListNumbers(numbers);
		System.out.println(sum);
	}

	private static int addListNumbers(List<Integer> numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum = sum + number;
		}
		return sum;
	}
}
