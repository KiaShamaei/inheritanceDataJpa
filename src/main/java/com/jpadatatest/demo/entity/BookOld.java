package com.jpadatatest.demo.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("bookOld")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class BookOld extends ProductBase{
    @NonNull
    private String isbn;
    @NonNull
    private Long price ;
    @NonNull
    private String dispatch;
}
