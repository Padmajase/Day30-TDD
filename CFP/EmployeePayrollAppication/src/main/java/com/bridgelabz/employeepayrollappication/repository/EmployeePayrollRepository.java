package com.bridgelabz.employeepayrollappication.repository;

import com.bridgelabz.employeepayrollappication.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData,Integer> {
}
