/*
package com.pubble.conpub.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@SequenceGenerator(
        name = "ITEM_OPTION_SEQ_GEN",
        sequenceName = "ITEM_OPTION_SEQ",
        initialValue = 1,
        allocationSize = 1
)
public class ItemOption {

    @Id
    @Column(name = "item_option_no")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ITEM_OPTION_SEQ_GEN"
    )
    private Long itemOptionNo;

    */
/*연관관계 설정 필요
    @JoinColumn(name = "item_no")
    private Item item;

    @JoinColumn(name = "option_no")
    private OptionList optionList;*//*

}
*/
