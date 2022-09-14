package com.ysingh.functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FP07DistinctAndSorted {

	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(12,9,13,5,4,2,4,12,15);
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		
		System.out.println("Print Distinct Numbers in List:");
		printDistinctNumbersInList(numbers);
		
		System.out.println();
		
		System.out.println("Print Numbers in sorted manner in List:");
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
		numbers.stream().distinct().forEach(System.out::println);
	}
	
	private static void printNumbersInSortedMannerInList(List<Integer> numbers) {
		numbers.stream().sorted().forEach(System.out::println);
	}
	
	private static void printCoursesInSortedMannerInList(List<String> courses) {
		courses.stream().sorted().forEach(System.out::println);
	}
	
	private static void printCoursesInReverseSortedMannerInList(List<String> courses) {
		courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
	private static void printCoursesInLengthSortedMannerInList(List<String> courses) {
		courses.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}
}
