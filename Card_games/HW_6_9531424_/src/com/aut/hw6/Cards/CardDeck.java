package com.aut.hw6.Cards;
import com.aut.hw6.DuelMonsters.*;
/**
 * Created by Roozbeh Ghasemi on 4/26/2017.
 */
public class CardDeck extends ObjectDeck{

    public CardDeck(Card ... cards) {
        super(cards);
    }


    @Override
    public Card deal() {
        return (Card) super.deal();
    }

}
