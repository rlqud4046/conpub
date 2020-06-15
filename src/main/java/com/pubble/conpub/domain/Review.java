package com.pubble.conpub.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@SequenceGenerator(
        name = "REVIEW_SEQ_GEN",
        sequenceName = "REVIEW_SEQ",
        initialValue = 1,
        allocationSize = 1
)
public class Review {

    @Id
    @Column(name = "review_no")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "REVIEW_SEQ_GEN"
    )
    private Long id;

    private Member member;

    private Item item;

    private String reviewPhoto;

    private LocalDateTime reviewDate;

    private int reviewStarpoint;

    private String reviewCont;

    @Enumerated(EnumType.STRING)
    private YesNo mileageOk;

}