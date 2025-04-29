package edu.icet.dto;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private Long id;
    private String name;
    private String department;
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;
}
