package com.paginationexample.repository;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.paginationexample.entity.Employee;

import org.springframework.data.domain.Pageable;


public interface EmployeeRepository extends JpaRepository<Employee, Long> { 
    Page<Employee> findByDepartment(String department, Pageable pageable);
}