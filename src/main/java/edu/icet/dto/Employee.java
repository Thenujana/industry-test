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
    @NonNull
    private String name;
    @NonNull
    private String department;
    @NonNull
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;
}
