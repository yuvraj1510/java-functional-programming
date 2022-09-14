package com.ysingh.functional;

import java.util.Arrays;
import java.util.List;

public class FP03PrintSquareOfEachListElement {
	
	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(12,9,13,5,4,2,4,12,15);
		
		printSquareOfNumbersInList(numbers);
		System.out.println();
		
		printSquareOfEvenNumbersInList(numbers);
		System.out.println();
		
		printSquareOfOddNumbersInList(numbers);
		System.out.println();
	}

	private static void printSquareOfNumbersInList(List<Integer> numbers) {
		System.out.println("Printing Square of Each Numbers: ");
		numbers.stream().map(number -> number * number).forEach(System.out::println);
	}
	
	private static void printSquareOfEvenNumbersInList(List<Integer> numbers) {
		System.out.println("Printing Square of Even Numbers: ");
		numbers.stream().filter(number -> number % 2 == 0).map(number -> number * number).forEach(System.out::println);
	}
	
	private static void printSquareOfOddNumbersInList(List<Integer> numbers) {
		System.out.println("Printing Square of Odd Numbers: ");
		numbers.stream().filter(number -> number % 2 != 0).map(number -> number * number).forEach(System.out::println);
	}
}
