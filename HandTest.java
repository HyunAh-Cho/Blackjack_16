package com.cnu.blackjack;

import static org.junit.Assert.assertTrue;

public class HandTest {

    public void 핸드는_카드를_한장씩_받을수_있다(){
        Hand hand = new Hand(new Deck(1));
        Card card = hand.drawCrad();
        hand.getCurrentHandSize();
        assertTrue(card != null);
    }
}
