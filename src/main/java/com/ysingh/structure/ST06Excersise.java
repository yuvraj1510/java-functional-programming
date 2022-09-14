package com.ysingh.structure;

import java.util.Arrays;
import java.util.List;

public class ST06Excersise {

	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(12,9,13,5,4,2,4,12,15);
		
		System.out.println("Square Each Number and Print Sum:");
		int sum = squareNumbersInListAndPrintSum(numbers);
		System.out.println(sum);
		
		System.out.println();
		
		System.out.println("Cube Each Number and Print Sum:");
		sum = cubeNumbersInListAndPrintSum(numbers);
		System.out.println(sum);
		
		System.out.println();
		
		System.out.println("Sum of Odd Numbers in the list:");
		sum = sumOfOddNumbersInList(numbers);
		System.out.println(sum);
		
		System.out.println();
		
	}
	
	private static int squareNumbersInListAndPrintSum(List<Integer> numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum = sum + (number * number);
		}
		return sum;
	}
	
	private static int cubeNumbersInListAndPrintSum(List<Integer> numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum = sum + (number * number * number);
		}
		return sum;
	}

	private static int sumOfOddNumbersInList(List<Integer> numbers) {
		int sum = 0;
		for(int number : numbers) {
			if(number % 2 != 0) {
				sum = sum + number;
			}
		}
		return sum;
	}
}
