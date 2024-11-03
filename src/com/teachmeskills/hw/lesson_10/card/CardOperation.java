package com.teachmeskills.hw.lesson_10.card;

public class CardOperation {

    public static void compareClientCards(BaseCard[] cards) {

        if (cards != null && cards.length > 1) {
            int counter = 0;
            boolean[] counted = new boolean[cards.length];

            for (int i = 0; i < cards.length; i++) {
                if (counted[i]) {
                    continue;
                }

                int count = 1;

                for (int j = i + 1; j < cards.length; j++) {
                    if (cards[i].equals(cards[j])) {
                        count++;
                        counted[j] = true;
                    }
                }

                if (count > 1) {
                    counter += count;
                }
            }
            if (counter > 0) {
                System.out.println("Identical cards found" + "\nTotal identical cards: " + counter);
            } else {
                System.out.println("No identical cards found.");
            }
        } else if (cards != null && cards.length == 1) {
            System.out.println("You have only one card. No any additional card to compare.");
        } else {
            System.out.println("Impossible to compare cards. Please, check available cards and try again");
        }
    }
}
