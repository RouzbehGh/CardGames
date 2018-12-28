package com.aut.hw6.DuelMonsters;

import com.aut.hw6.Cards.MonsterCard;

/**
 * Created by Roozbeh Ghasemi on 4/26/2017.
 */
public class BlueEyesWhiteDragon extends MonsterCard implements Special {



    public BlueEyesWhiteDragon() {
        super("BlueEyesWhiteDragon", "The best card.",3000,true);
    }

    public void instantEffect(Field owner, Field enemy) {
        BlueEyesWhiteDragon card1 = new BlueEyesWhiteDragon();
        BlueEyesWhiteDragon card2 = new BlueEyesWhiteDragon();
        if (owner.addMonsterCard(card1))
            owner.addMonsterCard(card2) ;
    }
}
