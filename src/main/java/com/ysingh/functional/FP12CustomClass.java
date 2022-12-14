package com.ysingh.functional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	
	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	public String toString() {
		return name + ":" + noOfStudents + ":" + reviewScore;
	}	
}

public class FP12CustomClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<Course> courses = new ArrayList<>();
		courses.add(new Course("Spring", "Framework", 98, 20000));
		courses.add(new Course("Spring Boot", "Framework", 95, 18000));
		courses.add(new Course("API", "Microservices", 97, 22000));
		courses.add(new Course("Microservices", "Microservices", 96, 25000));
		courses.add(new Course("FullStack", "FullStack", 91, 14000));
		courses.add(new Course("AWS", "Cloud", 92, 21000));
		courses.add(new Course("Azure", "Cloud", 99, 21000));
		courses.add(new Course("Docker", "Cloud", 92, 20000));
		courses.add(new Course("Kubernetes", "Cloud", 91, 20000));

		Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
		Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
		Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;
		
		System.out.println("All Match - reviewScoreGreaterThan90Predicate : "+courses.stream().allMatch(reviewScoreGreaterThan90Predicate));
		System.out.println("All Match - reviewScoreGreaterThan95Predicate : "+courses.stream().allMatch(reviewScoreGreaterThan95Predicate));
		System.out.println("None Match - reviewScoreLessThan90Predicate : "+courses.stream().noneMatch(reviewScoreLessThan90Predicate));
		System.out.println("Any Match - reviewScoreLessThan90Predicate : "+courses.stream().anyMatch(reviewScoreLessThan90Predicate));
		System.out.println("Any Match - reviewScoreGreaterThan95Predicate : "+courses.stream().anyMatch(reviewScoreGreaterThan95Predicate));
		
		Comparator<Course> comparingByNoOfStudentsIncreasing = Comparator.comparingInt(Course::getNoOfStudents);
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsIncreasing).collect(Collectors.toList()));
		
		Comparator<Course> comparingByNoOfStudentsDecreasing = Comparator.comparingInt(Course::getNoOfStudents).reversed();
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsDecreasing).collect(Collectors.toList()));
		
		Comparator<Course> comparingByNoOfStudentsAndNoOfReviews = Comparator.comparingInt(Course::getNoOfStudents).thenComparingInt(Course::getReviewScore).reversed();
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndNoOfReviews).collect(Collectors.toList()));
		
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndNoOfReviews).limit(5).collect(Collectors.toList()));
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndNoOfReviews).skip(3).collect(Collectors.toList()));
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndNoOfReviews).skip(3).limit(5).collect(Collectors.toList()));
		
		System.out.println(courses.stream().max(comparingByNoOfStudentsAndNoOfReviews));
		System.out.println(courses.stream().min(comparingByNoOfStudentsAndNoOfReviews));
		System.out.println(courses.stream().filter(reviewScoreLessThan90Predicate).min(comparingByNoOfStudentsAndNoOfReviews).orElse(new Course("Kubernetes", "Cloud", 91, 20000)));
		System.out.println(courses.stream().min(comparingByNoOfStudentsAndNoOfReviews).orElse(new Course("Kubernetes", "Cloud", 91, 20000)));
		
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95Predicate).findFirst());
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95Predicate).findAny());
		
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95Predicate).mapToInt(course -> course.getNoOfStudents()).sum());
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95Predicate).mapToInt(course -> course.getNoOfStudents()).average());
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95Predicate).mapToInt(course -> course.getNoOfStudents()).count());
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95Predicate).mapToInt(course -> course.getNoOfStudents()).max());
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95Predicate).mapToInt(course -> course.getNoOfStudents()).min());
		
		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory)));
		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.mapping(Course::getName, Collectors.toList()))));
		
		
		Predicate<Course> reviewScoreGreaterThan90Predicate2 = createPredecateReviewScore(90);
		Predicate<Course> reviewScoreGreaterThan95Predicate2 = createPredecateReviewScore(95);
	}

	//Higher Order Function
	private static Predicate<Course> createPredecateReviewScore(int cutOffReviewScore) {
		return course -> course.getReviewScore() > cutOffReviewScore;
	}

}
