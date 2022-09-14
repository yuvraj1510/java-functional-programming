package com.ysingh.structure;

import java.util.Arrays;
import java.util.List;

public class ST03PrintSquareOfEachListElement {
	
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
		for(int number : numbers) {
			number = number * number;
			System.out.println(number);
		}
	}
	
	private static void printSquareOfEvenNumbersInList(List<Integer> numbers) {
		System.out.println("Printing Square of Even Numbers: ");
		for(int number : numbers) {
			if(number % 2 == 0) {
				number = number * number;
				System.out.println(number);
			}
		}
		
	}
	
	private static void printSquareOfOddNumbersInList(List<Integer> numbers) {
		System.out.println("Printing Square of Odd Numbers: ");
		for(int number : numbers) {
			if(number % 2 != 0) {
				number = number * number;
				System.out.println(number);
			}
		}
		
	}
}
