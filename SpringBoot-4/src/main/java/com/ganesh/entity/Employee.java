package com.ganesh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Employees")
@Data
@NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String address;
	
	private String gender;
	
	private Double salary;
	
	private String dep;

	
	
	public Employee(String name, String address, String gender, Double salary, String dep) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.salary = salary;
		this.dep = dep;
	}
	
	
	
	

}
