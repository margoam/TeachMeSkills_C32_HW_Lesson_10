package com.teachmeskills.hw.lesson_10.client;

import com.teachmeskills.hw.lesson_10.card.BaseCard;

public class BaseClient {

    private final BaseCard[] cards;

    public BaseClient(String name, BaseCard[] cards) {
        this.cards = cards;
    }

    public BaseCard[] getCards() {
        return cards;
    }
}
