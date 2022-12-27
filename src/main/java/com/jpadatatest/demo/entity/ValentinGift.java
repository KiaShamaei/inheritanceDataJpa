package com.jpadatatest.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "valetine_gift")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class ValentinGift extends GiftBase{
    @NonNull
    private Long price ;
    @NonNull
    private Boolean withChoclate;
}
