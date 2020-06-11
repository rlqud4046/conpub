package com.pubble.conpub.domain;

import javax.persistence.*;

@Entity
@SequenceGenerator(
        name = "DELIVERY_SEQ_GEN",
        sequenceName = "DELIVERY_SEQ",
        initialValue = 1,
        allocationSize = 1
)
public class Delivery {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "DELIVERY_SEQ_GEN"
    )
    private Long deliveryNo;

    private Member member;

    private String deliveryName;

    private String addressBase;

    private String addressConf;

    private String zipcode;

    private String phoneNo;

}
