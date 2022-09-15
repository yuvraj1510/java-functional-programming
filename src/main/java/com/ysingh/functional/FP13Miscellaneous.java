package com.ysingh.functional;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FP13Miscellaneous {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------");
		
		System.out.println(Stream.of(12,9,13,5,4,2,4,12,15).count());
		
		System.out.println("-----------------------------");
		
		System.out.println(Stream.of(12,9,13,5,4,2,4,12,15).reduce(0, Integer::sum));
		
		System.out.println("-----------------------------");
		
		int[] numberArray = {12,9,13,5,4,2,4,12,15};
		System.out.println(Arrays.stream(numberArray).average());
		
		System.out.println("-----------------------------");
		
		System.out.println(Arrays.stream(numberArray).sum());
		
		System.out.println("-----------------------------");
		
		System.out.println(Arrays.stream(numberArray).min());
		
		System.out.println("-----------------------------");
		
		System.out.println(Arrays.stream(numberArray).max());
		
		System.out.println("-----------------------------");
		
		System.out.println(IntStream.range(1, 10).sum());
		
		System.out.println("-----------------------------");
		
		System.out.println(IntStream.rangeClosed(1, 10).sum());
		
		System.out.println("-----------------------------");
		
		System.out.println(IntStream.iterate(1, num -> num + 2).limit(10).peek(System.out::println).sum());
		
		System.out.println("-----------------------------");
		
		System.out.println(IntStream.iterate(2, num -> num + 2).limit(10).peek(System.out::println).sum());
		
		System.out.println("-----------------------------");
		
		System.out.println(IntStream.iterate(2, num -> num * 2).limit(10).peek(System.out::println).sum());
		
		System.out.println("-----------------------------");
		
		System.out.println(IntStream.iterate(2, num -> num * 2).limit(10).boxed().collect(Collectors.toList()));
		
		System.out.println("-----------------------------");
		
		System.out.println(LongStream.rangeClosed(1, 20).reduce(1, (num1, num2) -> num1 * num2));
		
		System.out.println("-----------------------------");
		
		System.out.println(LongStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply));
		
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		List<String> courses2 = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		System.out.println("-----------------------------");
		
		System.out.println(courses.stream().collect(Collectors.joining(" ")));
		System.out.println(courses.stream().collect(Collectors.joining(",")));
		
		System.out.println("-----------------------------");
		
		System.out.println(courses.stream().map(course -> course.split("")).collect(Collectors.toList()));
		System.out.println(courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList()));
		System.out.println(courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));
		
		System.out.println("-----------------------------");
		
		System.out.println(courses.stream().flatMap(course -> courses2.stream().map(course2 -> Arrays.asList(course, course2))).collect(Collectors.toList()));
		
		System.out.println(courses.stream().flatMap(course -> courses2.stream().map(course2 -> Arrays.asList(course, course2))).filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList()));
		
		System.out.println(courses.stream().flatMap(course -> courses2.stream().filter(course2 -> course2.length() == course.length()).map(course2 -> Arrays.asList(course, course2))).filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList()));
				
		System.out.println("-----------------------------");
	}

}
