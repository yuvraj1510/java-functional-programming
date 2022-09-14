package com.ysingh.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP09FunctionalInterfaceExpansion {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,9,13,5,4,2,4,12,15);

		Predicate<Integer> isEvenPredicate = new Predicate<Integer>() {
			@Override
			public boolean test(Integer number) {
				return number % 2 == 0;
			}
		};
		
		Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer number) {
				return number * number;
			}
		};
		
		Consumer<Integer> sysoutConsumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer number) {
				System.out.println(number);
			}
			
		};
		
		BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer num1, Integer num2) {
				return num1 + num2;
			}
		};
		
		numbers.stream().filter(isEvenPredicate).map(squareFunction).forEach(sysoutConsumer);
		System.out.println();
		
		int sum = numbers.stream().reduce(0, sumBinaryOperator2);
		System.out.println("SUM : "+sum);
	}

}
