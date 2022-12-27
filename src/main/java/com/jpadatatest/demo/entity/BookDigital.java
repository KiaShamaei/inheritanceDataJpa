package com.jpadatatest.demo.entity;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@DiscriminatorValue(value = "digitalbook")
@NoArgsConstructor
@RequiredArgsConstructor
public class BookDigital extends ProductBase{
    @NonNull
    private String url ;
    @NonNull
    private Date downloadable;
}
