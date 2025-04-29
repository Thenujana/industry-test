package edu.icet.entity;

import edu.icet.util.Department;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Department department;
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;
}
