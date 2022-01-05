package com.example.demo.SpringDemo;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {

	public static void main(String[] args) {

		String str = "All is well";
		countFrequency(str);

	}

	public static void countFrequency(String str) {
		System.out.println("lenegt of string is:" + str.length());
		HashMap<Character, Integer> countLetters = new HashMap<Character, Integer>();
		for (int j = 0; j < str.length(); j++) {
			if (countLetters.get(str.charAt(j)) == null) {
				countLetters.put(str.charAt(j), 1);
			} else {
				countLetters.put(str.charAt(j), countLetters.get(str.charAt(j)) + 1);
			}
		}
		for (Map.Entry<Character, Integer> m : countLetters.entrySet()) {
			System.out.println("letter is: " + m.getKey() + "and the frequency is" + m.getValue());
		}

	}

}
