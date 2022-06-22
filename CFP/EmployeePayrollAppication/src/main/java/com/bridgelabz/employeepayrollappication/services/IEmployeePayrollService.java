package com.bridgelabz.employeepayrollappication.services;

import com.bridgelabz.employeepayrollappication.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollappication.model.EmployeePayrollData;

import java.util.List;
import java.util.Optional;


public interface IEmployeePayrollService {

    List<EmployeePayrollData> getEmployePayrollData();

    Optional<EmployeePayrollData> getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO);

    void deleteEmployeePayrollData(int empId);
}
