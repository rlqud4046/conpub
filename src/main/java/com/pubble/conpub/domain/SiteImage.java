package com.pubble.conpub.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiteImage {
    @Id
    private int positionNo;

    private String imageSrc;

    private String link1;

    private String link2;

}