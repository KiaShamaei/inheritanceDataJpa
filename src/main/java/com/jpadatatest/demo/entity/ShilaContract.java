package com.jpadatatest.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "shila_contract")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class ShilaContract extends BaseContract{
    @NonNull
    private Long percent ;
    @NonNull
    @Column(name = "exp_time")
    private LocalDate expTime ;

}
