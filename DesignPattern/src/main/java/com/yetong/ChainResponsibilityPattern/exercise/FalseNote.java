package com.yetong.ChainResponsibilityPattern.exercise;

import lombok.Data;

import java.net.Inet4Address;

@Data
public class FalseNote {

    private Integer day;

    public FalseNote(Integer day) {
        this.day = day;
    }

}
