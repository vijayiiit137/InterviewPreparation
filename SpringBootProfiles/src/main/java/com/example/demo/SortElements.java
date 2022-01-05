package com.example.demo;

import java.util.ArrayList;

public class SortElements {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("Vijay");
		s.add("Kumar");
		s.add("KumarVijay");
		for(int i = 0; i < s.size();i++) {
			if(s.get(i).equals("Kumar")) {
				System.out.println("inside if condition");
				s.remove(i);
			}
		}
		System.out.println(s);
		
	}

}
