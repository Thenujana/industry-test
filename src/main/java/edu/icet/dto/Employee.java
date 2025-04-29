package edu.icet.dto;

import edu.icet.util.Department;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private Department department;
   @NonNull
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;
}
