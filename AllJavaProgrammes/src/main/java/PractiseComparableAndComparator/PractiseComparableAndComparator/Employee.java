package PractiseComparableAndComparator.PractiseComparableAndComparator;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee employee) {
		/* sorting based on name */
		if (this.getName().compareTo(employee.getName()) > 0) {
			return 1;
		} else if (this.getName().compareTo(employee.getName()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	public String toString() {
		return id + "" + name;
	}

}
