package com.pubble.conpub.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Reply {
    @Id
    private Long replyNo;

    private Long questionNo;

    private String replyCont;

    private LocalDateTime replyTime;


}