package com.pubble.conpub.domain;

import javax.persistence.*;

@Entity
@SequenceGenerator(
        name = "FAQ_SEQ_GEN",
        sequenceName = "FAQ_SEQ",
        initialValue = 1,
        allocationSize = 1
)
public class Faq {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "FAQ_SEQ_GEN"
    )
    private Long faqNo;

    private String faqQuestion;

    private String faqAnswer;

}