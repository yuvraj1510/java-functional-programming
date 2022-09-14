package com.ysingh.structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ST08Collect {

	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(12,9,13,5,4,2,4,12,15);
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		List<Integer> squareNumbers = squareListElement(numbers);
		System.out.println(squareNumbers);
		
		List<Integer> evenNumbers = getEvenNumberList(numbers);
		System.out.println(evenNumbers);
		
		List<Integer> lengthOfCourses = getLengthOfCoursesList(courses);
		System.out.println(lengthOfCourses);
		
	}

	private static List<Integer> squareListElement(List<Integer> numbers) {
		List<Integer> squareNumbers = new ArrayList<>();
		for(int number : numbers) {
			number = number * number;
			squareNumbers.add(number);
		}
		return squareNumbers;
	}
	
	private static List<Integer> getEvenNumberList(List<Integer> numbers) {
		List<Integer> evenNumbers = new ArrayList<>();
		for(int number : numbers) {
			if(number % 2 == 0) {
				evenNumbers.add(number);
			}
		}
		return evenNumbers;
	}
	
	private static List<Integer> getLengthOfCoursesList(List<String> courses) {
		List<Integer> lengthOfCourses = new ArrayList<>();
		for(String course : courses) {
			lengthOfCourses.add(course.length());
		}
		return lengthOfCourses;
	}
}
