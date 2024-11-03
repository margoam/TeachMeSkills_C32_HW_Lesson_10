package com.teachmeskills.hw.lesson_10.card;

import java.util.Objects;
import java.util.Random;

public class BaseCard {

    private final long cardNumber;
    private final int cvv;
    private final int amount;

    public BaseCard(int amount, int cardNumber, int cvv) {
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseCard baseCard = (BaseCard) o;
        return cardNumber == baseCard.cardNumber && cvv == baseCard.cvv;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, cvv);
    }
}
