package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class taskNumber4 {

    enum suits {
        SPADES, CLUBS, HEARTS, DIAMONDS;
    }

    enum values {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    }

    public static void taskNumber4_1() {
        int index = 0;
        String[] cards = new String[52];
        for (suits eachSuite : suits.values()) {
            for (values eachValue : values.values()) {
                cards[index] = eachSuite.toString() + " " + eachValue.toString();
                index++;
            }
        }
        List<String> StringList = Arrays.asList(cards);
        Collections.shuffle(StringList);
        StringList.toArray(cards);
        System.out.println("First card of list: "+Arrays.asList(cards[0]));
    }

    public static void main(String[] args) {
        taskNumber4_1();
    }
}
