package com.jpadatatest.demo.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "product_inheritance")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "productType" , discriminatorType = DiscriminatorType.STRING)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class ProductBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NonNull
    @Column(name = "create_at")
    private Date createAt;
    @NonNull
    @Column(name = "update_at")
    private Date updateAt;
    @NonNull
    @Column(name = "is_deleted")
    private Boolean isDeleted;
}
