package com.jpadatatest.demo.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public abstract class GiftBase {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    @NonNull
    @Column(name = "create_at")
    private Date createAt;
    @NonNull
    @Column(name="is_in_stock")
    private Boolean isInStock;
    @NonNull
    @Column(name = "is_event_base")
    private Boolean isEventBase ;
}
