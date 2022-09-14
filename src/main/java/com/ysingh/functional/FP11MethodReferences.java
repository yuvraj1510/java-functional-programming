package com.ysingh.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class FP11MethodReferences {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		//Method Reference on Static Method
		courses.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
		System.out.println("---------------");
		
		//Method Reference on Object of the class
		courses.stream().map(String::toUpperCase).forEach(System.out::println);
		
		System.out.println("---------------");
		Supplier<String> supplier = () -> new String();
		System.out.println("Empty String 1: "+supplier.get());
		
		//Method Reference on Constructor of the class
		Supplier<String> supplier1 = String::new;
		System.out.println("Empty String 2: "+supplier1.get());

	}

}
