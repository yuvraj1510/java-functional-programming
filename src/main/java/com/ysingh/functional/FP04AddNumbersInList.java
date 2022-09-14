package com.ysingh.functional;

import java.util.Arrays;
import java.util.List;

public class FP04AddNumbersInList {
	
	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(12,9,13,5,4,2,4,12,15);
		
		System.out.println("Calculating Sum of All Numbers: ");
		int sum = addListNumbers(numbers);
		System.out.println(sum);
	}

	private static int addListNumbers(List<Integer> numbers) {
		return numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
	}
}
