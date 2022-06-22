package com.bridgelabz.employeepayrollappication.model;


import com.bridgelabz.employeepayrollappication.dto.EmployeePayrollDTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeePayrollData {
    @Id
    private int empId;
    private String name;
    private long salary;

    public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO) {
        this.empId = employeeId;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
    }

    public EmployeePayrollData() {

    }

    public long getEmployeeId() {
        return empId;
    }

    public void setEmployeeId(int employeeId) {
        this.empId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
