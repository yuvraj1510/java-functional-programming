package com.ysingh.structure;

import java.util.Arrays;
import java.util.List;

public class ST01PrintListElement {
	
	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(12,9,13,5,4,2,4,12,15);
		
		printAllNumbersInList(numbers);
		System.out.println();
		
		printEvenNumbersInList(numbers);
		System.out.println();
		
		printOddNumbersInList(numbers);
		System.out.println();
		
	}

	private static void printAllNumbersInList(List<Integer> numbers) {
		System.out.println("Printing All Numbers: ");
		for(int number : numbers) {
			System.out.println(number);
		}
	}
	
	private static void printEvenNumbersInList(List<Integer> numbers) {
		System.out.println("Printing Even Numbers: ");
		for(int number : numbers) {
			if(number % 2 == 0) {
				System.out.println(number);
			}
		}
	}
	
	private static void printOddNumbersInList(List<Integer> numbers) {
		System.out.println("Printing Odd Numbers: ");
		for(int number : numbers) {
			if(number % 2 != 0) {
				System.out.println(number);
			}
		}
	}
}
