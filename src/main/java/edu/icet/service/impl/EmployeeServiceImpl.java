package edu.icet.service.impl;

import edu.icet.dto.Employee;
import edu.icet.entity.EmployeeEntity;
import edu.icet.repository.EmployeeRepository;
import edu.icet.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
 final ModelMapper mapper;
 final EmployeeRepository repository;

    @Override
    public void addEmployee(@RequestBody Employee employee) {
       repository.save(mapper.map(employee, EmployeeEntity.class));
    }

    @Override
    public List<Employee> getAll() {
        List<Employee>employeeList=new ArrayList<>();
        List<EmployeeEntity>all=repository.findAll();
        all.forEach(employeeEntity -> {
            employeeList.add(mapper.map(employeeEntity,Employee.class));
        });
        return employeeList;
    }

    @Override
    public void updateEmployee(Employee employee) {
     repository.save(mapper.map(employee,EmployeeEntity.class));
    }

    @Override
    public void deleteEmployee(Long id) {
      repository.deleteById(id);
    }

    @Override
    public Employee searchById(Long id) {
       return mapper.map(repository.findAllById(id),Employee.class);
    }

    @Override
    public List<Employee> searchByName(String name) {
        List<EmployeeEntity> employeeEntities = repository.findByName(name);
        return employeeEntities.stream()
                .map(employeeEntity -> mapper.map(employeeEntity, Employee.class))
                .collect(Collectors.toList());
    }

}
