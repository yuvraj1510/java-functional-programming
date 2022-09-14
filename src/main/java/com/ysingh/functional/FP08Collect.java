package com.ysingh.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP08Collect {

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
		return numbers.stream().map(number -> number * number).collect(Collectors.toList());
	}
	
	private static List<Integer> getEvenNumberList(List<Integer> numbers) {
		return numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
	}
	
	private static List<Integer> getLengthOfCoursesList(List<String> courses) {
		return courses.stream().map(course -> course.length()).collect(Collectors.toList());
	}
}
