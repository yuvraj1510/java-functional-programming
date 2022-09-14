package com.ysingh.structure;

import java.util.Arrays;
import java.util.List;

public class ST05MaximumAndMinimumNumberInList {
	
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
		int max = Integer.MIN_VALUE;
		for(int number : numbers) {
			if(number > max) {
				max = number;
			}
		}
		return max;
	}
	
	private static int minInListNumbers(List<Integer> numbers) {
		int min = Integer.MAX_VALUE;
		for(int number : numbers) {
			if(number < min) {
				min = number;
			}
		}
		return min;
	}
}
