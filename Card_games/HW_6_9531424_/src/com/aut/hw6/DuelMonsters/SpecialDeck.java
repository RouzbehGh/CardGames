package com.aut.hw6.DuelMonsters;
/**
 * Created by Roozbeh Ghasemi on 4/26/2017.
 */
public class SpecialDeck extends ObjectDeck{

    public SpecialDeck(Special...cards) {
        super(cards);
    }

    @Override
    public Special deal() {
        return (Special) super.deal();
    }

}
