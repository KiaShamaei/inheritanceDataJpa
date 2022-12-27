package com.jpadatatest.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "chrismath_gift")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class ChirsmathGift extends GiftBase{
    @NonNull
    private Long price;
    @NonNull
    private String name ;
}
