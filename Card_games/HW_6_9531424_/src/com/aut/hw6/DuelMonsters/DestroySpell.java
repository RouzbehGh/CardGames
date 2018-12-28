package com.aut.hw6.DuelMonsters;

import com.aut.hw6.Cards.SpellCard;
import com.aut.hw6.Cards.TrapCard;

/**
 * Created by Roozbeh Ghasemi on 4/26/2017.
 */
public class DestroySpell extends TrapCard {
    public DestroySpell() {
        super("“Destroy Spell", "Destroys the enemy’s first spell card.");
    }

    @Override
    public void instantEffect(Field owner, Field enemy) {
        SpellCard[] spell = enemy.getSpells() ;
        int count = enemy.getCurrent_spells_on_field() ;
        if (count > 0) {
            SpellCard[] result = new SpellCard[spell.length - 1];
            System.arraycopy(spell, 1, result, 0, result.length - 1 );
            enemy.setSpells(spell);
            enemy.setCurrent_spells_on_field(count-1);
        }

    }
}
