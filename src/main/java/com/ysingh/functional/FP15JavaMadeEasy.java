package com.ysingh.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FP15JavaMadeEasy {

	public static void main(String[] args) throws IOException {
		listOperations();
		fileOperations();
		threadOperations();
	}

	private static void listOperations() {
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		List<String> modifyableCourses = new ArrayList<>(courses);
		
		modifyableCourses.replaceAll(str -> str.toUpperCase());
		
		System.out.println(modifyableCourses);
		modifyableCourses.removeIf(course -> course.length() < 6);
		System.out.println(modifyableCourses);
	}
	
	private static void fileOperations() throws IOException {
		System.out.println("---------------------------------");
		Files.lines(Paths.get("file.txt")).forEach(System.out::println);
		System.out.println("---------------------------------");
		Files.lines(Paths.get("file.txt")).map(str -> str.split(" ")).flatMap(Arrays::stream).distinct().sorted().forEach(System.out::println);
		System.out.println("---------------------------------");
		Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);
		System.out.println("---------------------------------");
	}
	
	private static void threadOperations() {

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10000; i++) {
					System.out.println(Thread.currentThread().getId()+ ":" + i);
				}
			}
		};
		
		Thread thread1 = new Thread(runnable);
		thread1.start();
		
		Thread thread2 = new Thread(runnable);
		thread2.start();
		
		Thread thread3 = new Thread(runnable);
		thread3.start();
		
		Runnable runnable2 = () -> {
			for(int i=0; i<10000; i++) {
				System.out.println(Thread.currentThread().getId()+ ":" + i);
			}
		};
		
		Thread thread4 = new Thread(runnable2);
		thread4.start();
		
		Thread thread5 = new Thread(runnable2);
		thread5.start();
		
		Thread thread6 = new Thread(runnable2);
		thread6.start();
	
	}

}
