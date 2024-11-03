package com.teachmeskills.hw.lesson_10;

import com.teachmeskills.hw.lesson_10.card.BaseCard;
import com.teachmeskills.hw.lesson_10.card.CardOperation;
import com.teachmeskills.hw.lesson_10.client.BaseClient;

/**
 * Задача 1
 * Есть клиент.
 * Клиент может иметь любое кличество карт.
 * Карта имеет три поля - cvv-код, номер карты и сумма на карте.
 * Вывести на экран сообщение о том, сколько одинаковых карты имеет клиент.
 * Поле со значением суммы на карте не должно участвовать в сравнении.
 * Т.е. две краты с одними и теми же cvv-кодами и номерами, но разными суммами считаются одинаковыми.
 * Предусмотреть различные варианты выходного сообщения - например, у клиента нет ни одной карты совсем, у клиента нет одинаковых карт и другие возможные ситуации.
 */
public class ApplicationRunner {
    public static void main(String[] args) {

        BaseCard[] clientCards = {
                new BaseCard(50000, 1234, 111),
                new BaseCard(120000, 1234, 111),
                new BaseCard(120000, 1234, 111),
                new BaseCard(120000, 1244, 111),
                new BaseCard(120000, 1234, 112),
                new BaseCard(50000, 1234, 111),
                new BaseCard(120000, 1244, 111)
        };

        BaseClient client = new BaseClient("User1", clientCards);

        CardOperation.compareClientCards(client.getCards());
    }
}
