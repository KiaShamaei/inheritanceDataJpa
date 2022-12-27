package com.jpadatatest.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "employee_technical")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class EmployeeTechnical extends Employee {
    @NonNull
    private String level;
    @NonNull
    private Long salary ;
}
