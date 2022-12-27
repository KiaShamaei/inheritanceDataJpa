package com.jpadatatest.demo.entity;

import jakarta.persistence.*;
import lombok.*;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@MappedSuperclass
public abstract class BaseContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @NonNull
    private String name ;
}
