package com.jpadatatest.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @NonNull
    private String name ;
    @NonNull
    private String family ;
    @NonNull
    private String part;
}
