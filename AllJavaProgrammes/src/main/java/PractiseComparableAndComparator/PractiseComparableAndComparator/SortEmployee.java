package PractiseComparableAndComparator.PractiseComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployee {

	public static void main(String[] args) {

		Employee empOne = new Employee(1, "vijay");
		Employee empTwo = new Employee(2, "Kumar");
		Employee empThree = new Employee(3, "sathees");

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(empOne);
		employees.add(empTwo);
		employees.add(empThree);

		Collections.sort(employees);
		
		System.out.println(employees);
	}

}
