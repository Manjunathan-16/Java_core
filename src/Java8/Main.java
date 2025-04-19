package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "John", "Doe", "john@youtube.com", 50000.0);
		Employee employee2 = new Employee(2, "Jane", "Smith", "jane@gmail.com", 60000.0);
		Employee employee3 = new Employee(3, "Michael", "Johnson", "michael@yahoo.com", 55000.0);
		Employee employee4 = new Employee(4, "Emily", "Brown", "emily@example.com", 52000.0);
		Employee employee5 = new Employee(5, "David", "Williams", "david@example.com", 62000.0);
		Employee employee6 = new Employee(10, "Olivia", "Jones", "olivia@gmail.com", 58000.0);
		Employee employee7 = new Employee(7, "Daniel", "Davis", "daniel@yahoo.com", 54000.0);
		Employee employee8 = new Employee(8, "Sophia", "Miller", "sophia@oracle.com", 56000.0);
		Employee employee9 = new Employee(9, "William", "Wilson", "william@hotmail.com", 51000.0);
		Employee employee10 = new Employee(10, "Ava", "Moore", "ava@example.com", 59000.0);

		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);
		employees.add(employee7);
		employees.add(employee8);
		employees.add(employee9);
		employees.add(employee10);

		employees.stream().filter(n -> n.getEmail().endsWith(".com")).collect(Collectors.toList());

//		List<Employee> ans = employees.stream().filter(e -> e.getSalary() > 55000.0).collect(Collectors.toList());
		// List<Employee> ans = employees.stream().filter(e -> e.getSalary() > 60000 &&
		// e.getSalary() < 70000).collect(Collectors.toList());
//        List<Employee> ans = employees.stream().filter(e -> e.getLastName().startsWith("J")).collect(Collectors.toList());
//        List<Employee> ans = employees.stream().filter(e -> e.getEmail().contains("@example.com")).collect(Collectors.toList());

//        double avgSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
//        System.out.println(avgSalary);
//        List<Employee> ans = employees.stream().filter(e -> e.getSalary() >= avgSalary).collect(Collectors.toList());

//			List<String> ans = employees.stream().
//				filter(e -> e.getId() < 5).
//				map(m -> m.getFirstName()
//				.toUpperCase())
//				.collect(Collectors.toList());

//        List<Double> ans  = employees.stream().map(m -> m.getSalary() * 100)
		// .collect(Collectors.toList());

		// List<Employee> ans = employees.stream().filter(e ->
		// e.getEmail().endsWith(".com")).collect(Collectors.toList());

		// Map<Integer, List<Employee>> ans =
		// employees.stream().collect(Collectors.groupingBy(Employee::getId));
//        ans.forEach(System.out::println);

//        List<Employee> ans = employees.stream().
		// sorted(Collections.reverseOrder()).collect(Collectors.toList());
//		System.out.println(ans);
	}
}
