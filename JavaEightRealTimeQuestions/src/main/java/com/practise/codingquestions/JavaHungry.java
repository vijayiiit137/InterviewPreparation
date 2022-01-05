package com.practise.codingquestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaHungry {

	// Site Name is  java 8 practice coding questions
	// https://javahungry.blogspot.com/2020/05/java-8-coding-and-programming-interview-questions.html
	public static void main(String[] args) {

		// Given a list of integers, find out all the even numbers exist in the list
		// using Stream functions?
		List<Integer> evenNumbersList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		evenNumbersList = evenNumbersList.stream().filter(z -> z % 2 == 0).collect(Collectors.toList());
		System.out.println("even numbers list is:" + evenNumbersList);

		// Given a list of integers, find out all the numbers starting with 1 using
		// Stream functions?
		List<Integer> numbersStartingWithOne = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		// How to find duplicate elements in a given integers list in java using Stream
		// functions?

		// Given the list of integers, find the first element of the list using Stream
		// functions?
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Integer firstElement = myList.stream().findFirst().get();
		System.out.println("firstElement:" + firstElement);

		// Given a list of integers, find the total number of elements present in the
		// list using Stream functions?

		List<Integer> countElements = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		long count = countElements.stream().count();
		System.out.print("count is:" + count);

		// Given a list of integers, find the maximum value element present in it using
		// Stream functions?
		List<Integer> maximumElements = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		// List<String> maximumElements = Arrays.asList("a","b");

		/* First Way Of Writing */
		Integer maxElementFirstWay = maximumElements.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(maxElementFirstWay);
		/* Second Way Of Writing */
		Integer maximumElementSecondWay = maximumElements.stream().max(Integer::compare).get();
		System.out.println(maximumElementSecondWay);
		/* Third Way Of Writing */
		Integer maximumElementThirdWay = maximumElements.stream().max(Comparator.naturalOrder()).get();
		System.out.println(maximumElementThirdWay);

		// Find Min or Max char or String

		String maxChar = Stream.of("H", "T", "D", "I", "J").max(Comparator.comparing(String::valueOf)).get();
		System.out.println("max char is:" + maxChar);

		String minChar = Stream.of("H", "T", "D", "I", "J").min(Comparator.comparing(String::valueOf)).get();
		System.out.println("min char is:" + minChar);

		// Given a String, find the first non-repeated character in it using Stream
		// functions?

		// Given a String, find the first repeated character in it using Stream
		// functions?

		// Given a list of integers, sort all the values present in it using Stream
		// functions?

		// Given a list of integers, sort all the values present in it in descending
		// order using Stream functions?

	}

}
