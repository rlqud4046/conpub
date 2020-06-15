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
    @Column(name = "order_no")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ORDER_SEQ_GEN"
    )
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_no")
    private Member orderMember;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @OneToOne
    private SelectedOption selectedOption;

    private LocalDateTime orderDate;

}