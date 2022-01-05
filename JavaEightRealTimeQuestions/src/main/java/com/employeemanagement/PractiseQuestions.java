package com.employeemanagement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PractiseQuestions {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		answerQuestions(employeeList);
	}

	public static void answerQuestions(List<Employee> employeeList) {

		// How many male and female employees are there in the organization ?
		Map<String, Long> maleFemaleCount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(maleFemaleCount);
		// Print the name of all departments in the organization ?
		List<String> allDepartments = employeeList.stream().map(emp -> emp.getName()).distinct()
				.collect(Collectors.toList());
		System.out.println(allDepartments);
		// What is the average age of male and female employees ?
		Map<Integer, Double> avgAgeOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getAge, Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAgeOfMaleAndFemaleEmployees);
		// Get the details of highest paid employee in the organization?
		Optional<Employee> highestpaidEmployee = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getAge)));
		System.out.println(highestpaidEmployee);

		// Get the names of all employees who have joined after 2015?
		List<String> employeeNames = employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2015)
				.map(Employee::getName).collect(Collectors.toList());
		System.out.println(employeeNames);

		// count the number of employees in each department ?
		Map<String, Long> employeeDepartmentCount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(employeeDepartmentCount);

		// What is the average salary of each department?
		Map<String, Double> averageSalaryByDept = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(averageSalaryByDept);
		// Get the details of youngest male employee in the product development
		Optional<Employee> youngestEmployee = employeeList.stream()
				.filter(emp -> emp.getDepartment().equals("Product Development") && emp.getGender().equals("Male"))
				.collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)));
		System.out.println("Youngest employee details are:" + youngestEmployee.get());

		// Who has the most working experience in the organization?

		// How many male and female employees are there in the sales and marketing team?
		Map<String, Long> maleFemalecount = employeeList.stream()
				.filter(emp -> emp.getDepartment().equals("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(maleFemalecount);

		// What is the average salary of male and female employees?
		Map<String, Double> averagaeSalaryOfMaleFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(averagaeSalaryOfMaleFemale);

		// List down the names of all employees in each department?
		Map<String, List<Employee>> emplyeesByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		for (Map.Entry<String, List<Employee>> entrySet : emplyeesByDepartment.entrySet()) {
			System.out.println(entrySet.getKey() + "==" + entrySet.getValue());
		}

		// What is the average salary and total salary of the whole organization ?
		DoubleSummaryStatistics employeeStatistics = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Sum is = " + employeeStatistics.getSum());
		System.out.println("Average Salary =" + employeeStatistics.getAverage());

		// Separate the employees who are younger or equal to 25 years from those
		// employees who are older than 25 years

		Map<Boolean, List<Employee>> partitionEmployeesByAge = employeeList.stream()
				.collect(Collectors.partitioningBy(emp -> emp.getAge() > 25));
		for (Map.Entry<Boolean, List<Employee>> entry : partitionEmployeesByAge.entrySet()) {
			if (entry.getKey()) {
				System.out.println("Employees older than 25 years");
			} else {
				System.out.println("Employees younger than or equal to 25 years :");
			}

			System.out.println("-----------------------------");
			List<Employee> list = entry.getValue();
			System.out.println("list:" + list);

		}
		// Who is the oldest employee in the organization? What is his age and which
		// department he belongs to?
		Optional<Employee> oldestEmployee = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		System.out.println(oldestEmployee);

	}

}
