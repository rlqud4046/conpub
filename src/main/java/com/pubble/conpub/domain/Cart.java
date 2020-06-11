package com.pubble.conpub.domain;

import javax.persistence.*;

@Entity
@SequenceGenerator(
        name = "CART_SEQ_GEN",
        sequenceName = "CART_SEQ",
        initialValue = 1,
        allocationSize = 1
)
public class Cart {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "CART_SEQ_GEN"
    )
    private Long cartNo;

    private Member member;

    private SelectedOption SelectedOption;

    private String cartMemo;
}