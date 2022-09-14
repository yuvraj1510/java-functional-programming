package com.ysingh.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP10BehaviourParameterization {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,9,13,5,4,2,4,12,15);

		filterAndPrint(numbers, number -> number % 2 == 0);
		
		filterAndPrint(numbers, number -> number % 2 != 0);
		
		List<Integer> squaredNumbers = mapAndCreateNewList(numbers, number -> number * number);
		System.out.println(squaredNumbers);
		
		List<Integer> cubeNumbers = mapAndCreateNewList(numbers, number -> number * number * number);
		System.out.println(cubeNumbers);
		
		List<Integer> doubledNumbers = mapAndCreateNewList(numbers, number -> number + number);
		System.out.println(doubledNumbers);
		
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
		System.out.println();
	}
	
	private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> function) {
		List<Integer> convertedList = numbers.stream().map(function).collect(Collectors.toList());
		return convertedList;
	}
}
