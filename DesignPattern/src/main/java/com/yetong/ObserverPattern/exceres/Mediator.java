package com.yetong.ObserverPattern.exceres;

import java.util.Optional;

public class Mediator {
    private Shares shares;

    public Mediator(Shares shares) {
        this.shares = shares;
    }

    public void change(Integer rate) {
        if (rate > 5) {
            shares.setRate(shares.getRate() + rate);
            shares.notifyHolder();
        }
        Optional.ofNullable(shares).filter(e -> rate > 5).ifPresent(Shares::notifyHolder);
    }
}
