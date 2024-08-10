package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	String gender;
	int age;
	double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String gender, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

public class EmployeeMain {
	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.addAll(Arrays.asList(
				new Employee(101, "Mohit", "Male", 26, 55000.00),
				new Employee(102, "Nihit", "Male", 06,70000.00),
				new Employee(103, "Divisha", "Female", 02,85000.00),
				new Employee(104, "Murari","Male",01, 90000.00),
				new Employee(105, "Rithanya","Female",01,100000.00)
				));
		
		// Get Highest Salary
		Employee highestSalary=emp.stream().max(Comparator.comparing(Employee :: getSalary)).orElseThrow(NoSuchElementException :: new);
		System.out.println(highestSalary.getName()+" "+highestSalary.getSalary());
	}
}
