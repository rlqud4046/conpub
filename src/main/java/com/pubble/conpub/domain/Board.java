package com.pubble.conpub.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@SequenceGenerator(
        name = "BOARD_SEQ_GEN",
        sequenceName = "BOARD_SEQ",
        initialValue = 1,allocationSize = 1
)
public class Board {
    @Id@GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "BOARD_SEQ_GEN")
    private Long boardNo;

    private Member member;

    private String boardTitle;

    private int boardSortationNo;

    private String boardCont;

    private LocalDateTime boardDate;

    @Enumerated(EnumType.STRING)
    private QuestionResponse questionResponse;

}