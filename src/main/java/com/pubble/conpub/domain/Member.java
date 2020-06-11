package com.pubble.conpub.domain;

import javax.persistence.*;

@Entity
@SequenceGenerator(
        name = "MEMBER_SEQ_GEN",
        sequenceName = "MEMBER_SEQ",
        initialValue = 1,
        allocationSize = 1
)
public class Member {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "MEMBER_SEQ_GEN"
    )
    private Long memberNo;

    private String memberId;

    private String memberPwd;

    private String memberName;

    private String memberBirth;

    private String memberEmail;

    @Enumerated(EnumType.STRING)
    private EmailAgree emailAgree;

    private String memberPhone;

    @Enumerated(EnumType.STRING)
    private SmsAgree smsAgree;

    private String memberMemo;

}