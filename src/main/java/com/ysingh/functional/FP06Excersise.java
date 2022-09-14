package com.ysingh.functional;

import java.util.Arrays;
import java.util.List;

public class FP06Excersise {

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
		return numbers.stream().map(number -> number * number).reduce(0, (num1, num2) -> num1 + num2);
	}
	
	private static int cubeNumbersInListAndPrintSum(List<Integer> numbers) {
		return numbers.stream().map(number -> number * number * number).reduce(0, (num1, num2) -> num1 + num2);
	}

	private static int sumOfOddNumbersInList(List<Integer> numbers) {
		return numbers.stream().filter(number -> number % 2 != 0).reduce(0, (num1, num2) -> num1 + num2);
	}
}
