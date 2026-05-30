package com.ganesh.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
