package com.aut.hw6.Cards;
import com.aut.hw6.DuelMonsters.*;
/**
 * Created by Roozbeh Ghasemi on 4/26/2017.
 */
public abstract class SpellCard extends Card{


    public SpellCard(String name, String description) {
        super(name, description);

    }

    public abstract void turnEffect(Field ownerField, Field enemyField) ;

    public abstract void destroyedEffect(Field ownerField, Field enemyField) ;

    @Override
    public boolean equals(Object acard) {

        if (!(acard instanceof SpellCard))
            return false ;
        SpellCard temp_card = (SpellCard)acard ;
        if (name.equals(temp_card.getName()) && description.equals(temp_card.getDescription()))
            return true ;
        if (!super.equals(acard)) return false ;

        return true ;

    }

}
