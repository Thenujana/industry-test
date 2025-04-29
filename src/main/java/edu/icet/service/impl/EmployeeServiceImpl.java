package edu.icet.service.impl;

import edu.icet.dto.Employee;
import edu.icet.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public List<Employee> getAll() {
        return List.of();
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Long id) {

    }

    @Override
    public Employee searchById(Long id) {
        return null;
    }

    @Override
    public List<Employee> searchByName(String name) {
        return List.of();
    }
}
