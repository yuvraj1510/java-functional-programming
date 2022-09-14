package com.ysingh.functional;

import java.util.Arrays;
import java.util.List;

public class FP05MaximumAndMinimumNumberInList {
	
	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(12,9,13,5,4,2,4,12,15);
		
		System.out.println("Calculating Max Number from All Numbers: ");
		int max = maxInListNumbers(numbers);
		System.out.println(max);
		
		System.out.println();
		
		System.out.println("Calculating Min Number from All Numbers: ");
		int min = minInListNumbers(numbers);
		System.out.println(min);
	}

	private static int maxInListNumbers(List<Integer> numbers) {
		return numbers.stream().reduce(Integer.MIN_VALUE, (num1, num2) -> num1 > num2 ? num1 : num2);
	}
	
	private static int minInListNumbers(List<Integer> numbers) {
		return numbers.stream().reduce(Integer.MAX_VALUE, (num1, num2) -> num1 > num2 ? num2 : num1);
	}
}
