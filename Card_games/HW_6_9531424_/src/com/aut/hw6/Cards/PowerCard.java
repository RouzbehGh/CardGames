package com.aut.hw6.Cards;
import com.aut.hw6.DuelMonsters.*;
/**
 * Created by Roozbeh Ghasemi on 4/26/2017.
 */
public class PowerCard extends SpellCard {

    public PowerCard() {
        super("Power Card", "Increases power of monsters by 100 each turn");
    }

    @Override
    public void turnEffect(Field ownerField, Field enemyField) {
        MonsterCard[] monsters = ownerField.getMonsters() ;
        int count = ownerField.getCurrent_monsters_on_field() ;
        for (int i = 0 ; i < count ; i++){
            monsters[i].setPower(monsters[i].getPower() + 100);

        }

    }

    @Override
    public void destroyedEffect(Field ownerField, Field enemyField) {
        MonsterCard[] monsters = ownerField.getMonsters() ;
        int count = ownerField.getCurrent_monsters_on_field() ;
        for (int i = 0 ; i < count ; i++){
            monsters[i].setPower(monsters[i].getPower() -300);

        }
    }


}