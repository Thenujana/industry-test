package edu.icet.repository;

import edu.icet.dto.Employee;
import edu.icet.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
    List<Employee> findByName(String name);
    Object findAllById(Long id);
}
