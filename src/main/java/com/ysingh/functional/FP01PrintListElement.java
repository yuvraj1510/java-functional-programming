package com.ysingh.functional;

import java.util.Arrays;
import java.util.List;

public class FP01PrintListElement {
	
	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(12,9,13,5,4,2,4,12,15);
		
		printAllNumbersInListWithCustomMethod(numbers);
		System.out.println();
		
		printAllNumbersInListWithExistingSystemMethod(numbers);
		System.out.println();
		
		printEvenNumbersInList(numbers);
		System.out.println();
		
		printOddNumbersInList(numbers);
		System.out.println();
	}

	private static void printAllNumbersInListWithCustomMethod(List<Integer> numbers) {
		System.out.println("With Custom Method: ");
		numbers.stream().forEach(FP01PrintListElement::print);
	}
	
	private static void print(int number) {
		System.out.println(number);
	}
	
	private static void printAllNumbersInListWithExistingSystemMethod(List<Integer> numbers) {
		System.out.println("With Existing System Method: ");
		numbers.stream().forEach(System.out::println);
	}
	
	private static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	private static void printEvenNumbersInList(List<Integer> numbers) {
		System.out.println("Printing Even Numbers using Method Reference: ");
		numbers.stream().filter(FP01PrintListElement::isEven).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Printing Even Numbers using Lambda Expression: ");
		numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
	}
	
	private static void printOddNumbersInList(List<Integer> numbers) {
		System.out.println("Printing Odd Numbers using: ");
		numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
	}
}
