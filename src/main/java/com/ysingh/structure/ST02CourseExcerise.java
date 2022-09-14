package com.ysingh.structure;

import java.util.Arrays;
import java.util.List;

public class ST02CourseExcerise {
	
	public static void main(String args[]) {
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		System.out.println("Print all courses:");
		for(String course : courses) {
			System.out.println(course);
		}
		
		System.out.println();
		
		System.out.println("Print Courses having Spring in it:");
		for(String course : courses) {
			if(course.contains("Spring")) {
				System.out.println(course);
			}
		}
		
		System.out.println();
		
		System.out.println("Print Courses having name with atleast 4 letters:");
		for(String course : courses) {
			if(course.length() > 3) {
				System.out.println(course);
			}
		}
		
		System.out.println();
		
		System.out.println("Print Number of Characters for each course:");
		for(String course : courses) {
			System.out.println(course.length());
		}
	}	
}
