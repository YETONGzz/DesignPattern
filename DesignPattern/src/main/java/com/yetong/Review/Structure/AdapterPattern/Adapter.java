package com.yetong.Review.Structure.AdapterPattern;

import java.util.concurrent.TransferQueue;

public class Adapter implements Trainer {

    ChineseTranslate chineseTranslate;

    EnglishTranslate englishTranslate;

    public Adapter() {
        chineseTranslate = new ChineseTranslate();
        englishTranslate = new EnglishTranslate();
    }

    @Override
    public void talk(String str) {
        chineseTranslate.talkChina(str);
    }
}
