package com.pubble.conpub.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@SequenceGenerator(
        name = "ORDER_SEQ_GEN",
        sequenceName = "ORDER_SEQ",
        initialValue = 1,
        allocationSize = 1
)
public class Order {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ORDER_SEQ_GEN"
    )
    private Long orderNo;

    private Member member;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    private SelectedOption selectedOption;

    private LocalDateTime orderDate;

}