package com.bridgelabz.employeepayrollappication.services;

import com.bridgelabz.employeepayrollappication.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollappication.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollappication.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

//    List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
    @Autowired
    private EmployeePayrollRepository employeePayrollRepository;

   @Override
    public List<EmployeePayrollData> getEmployePayrollData() {
        return employeePayrollRepository.findAll();
    }

    @Override
    public Optional<EmployeePayrollData> getEmployeePayrollDataById(int empId) {
        return employeePayrollRepository.findById(empId);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = new EmployeePayrollData(employeePayrollRepository.findAll().size() +1, employeePayrollDTO);
        employeePayrollRepository.save(employeePayrollData);
        return employeePayrollData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        employeePayrollRepository.deleteById(empId);
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        List<EmployeePayrollData> employeePayrollDataList = this.getEmployePayrollData();
        for (EmployeePayrollData empData : employeePayrollDataList) {
            if(empData.getEmployeeId() == empId) {
                empData.setName(employeePayrollDTO.name);
                empData.setSalary(employeePayrollDTO.salary);
                employeePayrollRepository.save(empData);
                return empData;
            }
        }
        return null;
    }

}
