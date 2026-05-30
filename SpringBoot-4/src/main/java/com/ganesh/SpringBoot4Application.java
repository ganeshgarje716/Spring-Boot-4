package com.ganesh;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.ganesh.Repository.EmployeeRepository;
import com.ganesh.entity.Employee;

@SpringBootApplication
public class SpringBoot4Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot4Application.class, args);
	}
	
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
//		List<Employee> employees = Arrays.asList(
//
//			    new Employee("Ganesh", "Pune", "Male", 80000.00, "IT"),
//			    new Employee("Amit", "Mumbai", "Male", 75000.00, "HR"),
//			    new Employee("Sneha", "Nashik", "Female", 68000.00, "Finance"),
//			    new Employee("Priya", "Nagpur", "Female", 72000.00, "Marketing"),
//			    new Employee("Rahul", "Aurangabad", "Male", 85000.00, "IT"),
//			    new Employee("Neha", "Pune", "Female", 62000.00, "Support"),
//			    new Employee("Rohit", "Delhi", "Male", 91000.00, "Management"),
//			    new Employee("Pooja", "Bangalore", "Female", 77000.00, "IT"),
//			    new Employee("Karan", "Hyderabad", "Male", 83000.00, "DevOps"),
//			    new Employee("Anjali", "Chennai", "Female", 71000.00, "Testing"),
//
//			    new Employee("Vikas", "Kolkata", "Male", 65000.00, "Sales"),
//			    new Employee("Meena", "Jaipur", "Female", 69000.00, "HR"),
//			    new Employee("Arjun", "Surat", "Male", 88000.00, "IT"),
//			    new Employee("Komal", "Indore", "Female", 74000.00, "Finance"),
//			    new Employee("Nitin", "Patna", "Male", 60000.00, "Support"),
//			    new Employee("Sakshi", "Lucknow", "Female", 73000.00, "Marketing"),
//			    new Employee("Yash", "Bhopal", "Male", 81000.00, "IT"),
//			    new Employee("Rani", "Goa", "Female", 67000.00, "Admin"),
//			    new Employee("Akash", "Noida", "Male", 92000.00, "Cloud"),
//			    new Employee("Divya", "Ahmedabad", "Female", 76000.00, "Testing"),
//
//			    new Employee("Harsh", "Pune", "Male", 87000.00, "Security"),
//			    new Employee("Tina", "Mumbai", "Female", 64000.00, "Support"),
//			    new Employee("Suresh", "Nashik", "Male", 59000.00, "HR"),
//			    new Employee("Kavya", "Nagpur", "Female", 78000.00, "IT"),
//			    new Employee("Manoj", "Delhi", "Male", 86000.00, "Management"),
//			    new Employee("Aarti", "Bangalore", "Female", 70000.00, "Finance"),
//			    new Employee("Deepak", "Hyderabad", "Male", 94000.00, "DevOps"),
//			    new Employee("Nisha", "Chennai", "Female", 66000.00, "Sales"),
//			    new Employee("Rakesh", "Kolkata", "Male", 89000.00, "IT"),
//			    new Employee("Payal", "Jaipur", "Female", 61000.00, "Marketing"),
//
//			    new Employee("Ajay", "Surat", "Male", 82000.00, "Cloud"),
//			    new Employee("Shweta", "Indore", "Female", 75000.00, "Admin"),
//			    new Employee("Varun", "Patna", "Male", 63000.00, "Testing"),
//			    new Employee("Mansi", "Lucknow", "Female", 71000.00, "Support"),
//			    new Employee("Sameer", "Bhopal", "Male", 88000.00, "IT"),
//			    new Employee("Rutuja", "Goa", "Female", 79000.00, "Finance"),
//			    new Employee("Aditya", "Noida", "Male", 97000.00, "Security"),
//			    new Employee("Bhavna", "Ahmedabad", "Female", 68000.00, "HR"),
//			    new Employee("Kishor", "Pune", "Male", 73000.00, "Sales"),
//			    new Employee("Monika", "Mumbai", "Female", 84000.00, "IT"),
//
//			    new Employee("Pratik", "Nashik", "Male", 76000.00, "DevOps"),
//			    new Employee("Simran", "Nagpur", "Female", 69000.00, "Marketing"),
//			    new Employee("Abhishek", "Aurangabad", "Male", 91000.00, "Cloud"),
//			    new Employee("Rekha", "Delhi", "Female", 62000.00, "Admin"),
//			    new Employee("Sanjay", "Bangalore", "Male", 85000.00, "Testing"),
//			    new Employee("Isha", "Hyderabad", "Female", 74000.00, "Finance"),
//			    new Employee("Nilesh", "Chennai", "Male", 93000.00, "IT"),
//			    new Employee("Tanvi", "Kolkata", "Female", 65000.00, "Support"),
//			    new Employee("Omkar", "Jaipur", "Male", 81000.00, "Security"),
//			    new Employee("Pallavi", "Surat", "Female", 72000.00, "HR")
//
//			);
//
//			employeeRepository.saveAll(employees);
		
		
		
		
		
//		1//Sorting
		
//		Sort sort = Sort.by("name").descending();
//		employeeRepository.findAll(sort).forEach(i->System.err.println(i));
//		
		
		
		
		
//		2//Pagination
		
//		int pageNo=2;
//		
//		PageRequest of = PageRequest.of(pageNo - 1, 10);
//		
//		Page<Employee> all = employeeRepository.findAll(of);
//		
//		List<Employee> employees = all.getContent();
//		
//		employees.forEach(i->System.err.println(i));
		
		
		
		
//		3//Filteration
		
		Employee e=new Employee();
		e.setGender("Female");
		
		Example<Employee> of = Example.of(e);
		
		List<Employee> all = employeeRepository.findAll(of);
		
		all.forEach(i->System.err.println(i));
		
		
		
		
		
	}

}
