package com.ysingh.structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ST07DistinctAndSorted {

	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(12,9,13,5,4,2,4,12,15);
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		System.out.println("Print Distinct Numbers in List:");
		printDistinctNumbersInList(numbers);
		
		System.out.println();
		
		System.out.println("Print Numbers in manner in List:");
		printNumbersInSortedMannerInList(numbers);
		
		System.out.println();
		
		System.out.println("Print Courses in sorted manner in List:");
		printCoursesInSortedMannerInList(courses);
		
		System.out.println();
		
		System.out.println("Print Courses in reverse sorted manner in List:");
		printCoursesInReverseSortedMannerInList(courses);
		
		System.out.println();
		
		System.out.println("Print Courses in length sorted manner in List:");
		printCoursesInLengthSortedMannerInList(courses);
		
		System.out.println();
	}
	
	private static void printDistinctNumbersInList(List<Integer> numbers) {
		List<Integer> visited = new ArrayList<>();
		for(int number : numbers) {
			if(!visited.contains(number)) {
				System.out.println(number);
				visited.add(number);
			}
		}
	}
	
	private static void printNumbersInSortedMannerInList(List<Integer> numbers) {
		numbers.sort(Comparator.comparing(Integer::intValue));
		for(int number : numbers) {
			System.out.println(number);
		}
	}
	
	private static void printCoursesInSortedMannerInList(List<String> courses) {
		courses.sort(Comparator.naturalOrder());
		for(String course : courses) {
			System.out.println(course);
		}
	}
	
	private static void printCoursesInReverseSortedMannerInList(List<String> courses) {
		courses.sort(Comparator.reverseOrder());
		for(String course : courses) {
			System.out.println(course);
		}
	}
	
	private static void printCoursesInLengthSortedMannerInList(List<String> courses) {
		Comparator<String> sortByLength = Comparator.comparing(String::length);
		courses.sort(sortByLength);
		for(String course : courses) {
			System.out.println(course);
		}
	}
}
