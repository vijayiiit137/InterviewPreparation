package PractiseComparableAndComparator.PractiseComparableAndComparator;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer customerOne, Customer customertwo) {

		if (customerOne.getCustomerName().compareTo(customertwo.getCustomerName()) > 0) {
			return 1;
		} else if (customerOne.getCustomerName().compareTo(customertwo.getCustomerName()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}
