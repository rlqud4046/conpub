package com.pubble.conpub.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@SequenceGenerator(
        name = "MILEAGE_SEQ_GEN",
        sequenceName = "MILEAGE_SEQ",
        initialValue = 1,
        allocationSize = 1
)
public class Mileage {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "MILEAGE_SEQ_GEN"
    )
    private Long mileageNo;

    private Member member;

    private BigDecimal mileage;

    private String mileagePath;

    private LocalDateTime mileageDate;

}

