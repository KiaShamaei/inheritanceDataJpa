package com.jpadatatest.demo.repository;

import com.jpadatatest.demo.entity.Employee;
import com.jpadatatest.demo.entity.ProductBase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee , Long> {
}
