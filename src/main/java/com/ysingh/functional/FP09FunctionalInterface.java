package com.ysingh.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP09FunctionalInterface {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,9,13,5,4,2,4,12,15);

		Predicate<Integer> isEvenPredicate = number -> number % 2 == 0;
		
		Function<Integer, Integer> squareFunction = number -> number * number;
		
		Consumer<Integer> sysoutConsumer = System.out::println;
		
		System.out.println("Predicate + Function + Consumer:");
		numbers.stream().filter(isEvenPredicate).map(squareFunction).forEach(sysoutConsumer);
		System.out.println();
		
		BinaryOperator<Integer> sumBinaryOperator = (num1, num2) -> num1 + num2;
		
		System.out.println("BinaryOperator:");
		int sum = numbers.stream().reduce(0, sumBinaryOperator);
		System.out.println("SUM : "+sum);
		System.out.println();
		
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		System.out.println("Supplier:");
		System.out.println(randomIntegerSupplier.get());
		System.out.println();
		
		UnaryOperator<Integer> unaryOperator = num -> 3 * num;
		System.out.println("UnaryOperator:");
		System.out.println(unaryOperator.apply(10));
		System.out.println();
		
		BiPredicate<Integer, Integer> isNumberEqualPredicate = (num1, num2) -> num1 == num2;
		System.out.println("BiPredicate:");
		System.out.println(isNumberEqualPredicate.test(10, 10));
		System.out.println();
		
		BiFunction<Integer, String, String> biFunction = (num, str) -> num + " " + str;
		System.out.println("BiFunction:");
		System.out.println(biFunction.apply(15, "October"));
		System.out.println();
		
		BiConsumer<Integer, String> biConsumer = (num, str2) -> {
			System.out.println(num);
			System.out.println(str2);
		};
		System.out.println("BiConsumer:");
		biConsumer.accept(15, "August");
		System.out.println();
		
		IntBinaryOperator intBinaryOperator = (num1, num2) -> num1 + num2;
		System.out.println("IntBinaryOperator:");
		System.out.println(intBinaryOperator.applyAsInt(10, 20));
		System.out.println();
		
		IntConsumer intConsumer = num -> System.out.println(num);
		System.out.println("IntConsumer:");
		intConsumer.accept(15);
		System.out.println();
		
		IntFunction<Integer> intFunction = num -> num * 2;
		System.out.println("IntFunction:");
		System.out.println(intFunction.apply(12));
		System.out.println();
		
		IntPredicate intPredicate = num -> num > 15;
		System.out.println("IntPredicate:");
		System.out.println(intPredicate.test(18));
		System.out.println();
		
		IntSupplier intSupplier = () -> {
			Random random = new Random();
			return random.nextInt(100);
		};
		System.out.println("IntSupplier:");
		System.out.println(intSupplier.getAsInt());
		System.out.println();
		
		IntToDoubleFunction intToDoubleFunction = num -> num * 2.5;
		System.out.println("IntToDoubleFunction:");
		System.out.println(intToDoubleFunction.applyAsDouble(5));
		System.out.println();
		
		IntToLongFunction intToLongFunction = num -> num * num;
		System.out.println("IntToLongFunction:");
		System.out.println(intToLongFunction.applyAsLong(5));
		System.out.println();
		
		IntUnaryOperator intUnaryOperator = num -> 3 * num;
		System.out.println("IntUnaryOperator:");
		System.out.println(intUnaryOperator.applyAsInt(2));
		System.out.println();
				
	}

}
