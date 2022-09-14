package com.ysingh.functional;

import java.util.Arrays;
import java.util.List;

public class FP02CourseExcerise {
	
	public static void main(String args[]) {
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		System.out.println("Print all courses:");
		courses.stream().forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Print Courses having Spring in it:");
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Print Courses having name with atleast 4 letters:");
		courses.stream().filter(course -> course.length() > 3).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Print Number of Characters for each course:");
		courses.stream().map(course -> course.length()).forEach(System.out::println);
	}	
}
