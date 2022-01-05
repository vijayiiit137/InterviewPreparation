package PractiseComparableAndComparator.PractiseComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCustomer {

	public static void main(String[] args) {

		List<Customer> allCutomers = new ArrayList<Customer>();

		Customer customerOne = new Customer(1, "vijay");
		Customer customerTwo = new Customer(2, "satheesh");

		allCutomers.add(customerOne);
		allCutomers.add(customerTwo);

		Collections.sort(allCutomers, new CustomerComparator());

		System.out.println(allCutomers);

	}

}
