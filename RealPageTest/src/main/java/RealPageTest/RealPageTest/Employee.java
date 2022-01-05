package RealPageTest.RealPageTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Employee {

	private long id;
	private String name;
	private double salary;

	public Employee(long id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int hashCode() {
		return (int) (name.hashCode() + salary);
	}

	public boolean equals(Object obj) {

		if (obj instanceof Employee) {
			Employee emp = (Employee) obj;
			return emp.getName().equals(this.getName()) && emp.getSalary() == this.getSalary();
		}
		return false;
	}

	public static void removeDuplicate(List<Employee> employees) {

		HashSet<Employee> removeDuplicateObjects = new HashSet<Employee>();
		
		
		for(Employee emp : employees) {
			removeDuplicateObjects.add(emp);
		}
		
		List<Employee> sortedList = new ArrayList<>(removeDuplicateObjects);
		
		System.out.println(removeDuplicateObjects);
		System.out.println(sortedList);
		
		Collections.sort(sortedList,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getId() - o2.getId());
			}
			
		});
		
		System.out.println(sortedList);
		
		
		
		//Collections.sort(list);
		

//		1 A 1000.0
//		2 A 1000.0
//		3 A 1000.0
//		4 B 1000.0
//		5 C 100.0
//		6 A 100.0

	}

	public static void main(String[] args) {

		List<Employee> allEmployeesList = new ArrayList<Employee>();

		Employee empOne = new Employee(1, "A", 1000.0);
		Employee empTwo = new Employee(2, "A", 1000.0);
		Employee empThree = new Employee(3, "A", 1000.0);
		Employee empFour = new Employee(4, "B", 1000.0);
		Employee empFive = new Employee(5, "C", 1000.0);
		Employee empSix = new Employee(6, "A", 100.0);

		allEmployeesList.add(empOne);
		allEmployeesList.add(empTwo);
		allEmployeesList.add(empThree);
		allEmployeesList.add(empFour);
		allEmployeesList.add(empFive);
		allEmployeesList.add(empSix);

		removeDuplicate(allEmployeesList);

	}

}
