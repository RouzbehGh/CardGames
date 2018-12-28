package com.aut.hw6.Cards;

import com.aut.hw6.DuelMonsters.Special;

/**
 * Created by Roozbeh Ghasemi on 4/27/2017.
 */
public abstract class TrapCard extends Card implements Special {

    public TrapCard(String name, String description) {
        super(name, description);
    }

    @Override
    public boolean equals(Object acard) {

        if (!(acard instanceof TrapCard))
            return false ;
        TrapCard temp_card = (TrapCard)acard ;
        if (name.equals(temp_card.getName()) && description.equals(temp_card.getDescription()))
            return true ;
        if (!super.equals(acard))
            return false ;

        return true ;
    }

}

