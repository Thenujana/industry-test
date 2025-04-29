package edu.icet.controller;

import edu.icet.dto.Employee;
import edu.icet.service.impl.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {
    private final EmployeeServiceImpl employeeService;

    @PostMapping("/add-employee")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }
@GetMapping("/get-all")
    public List<Employee> getAll(){
        return employeeService.getAll();
}
@DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable Long id){
        employeeService.deleteEmployee(id);
}
@PutMapping("/update-employee")
    public void updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
}
@GetMapping("/search-by-id/{id}")
  public Employee searchById(@PathVariable Long id){
        return employeeService.searchById(id);
}
@GetMapping("/search-by-name/{name}")
    public List<Employee>searchByName(@PathVariable String name){
        return employeeService.searchByName(name);
}
}
