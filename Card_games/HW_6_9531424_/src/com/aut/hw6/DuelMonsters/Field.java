package com.aut.hw6.DuelMonsters;
import  com.aut.hw6.Cards.*;
/**
 * Created by Roozbeh Ghasemi on 4/26/2017.
 */
public class Field {

    MonsterCard[] monsters = new MonsterCard[5];
    SpellCard[] spells =  new SpellCard[5] ;

    int current_monsters_on_field ;
    int current_spells_on_field ;

    public Field() {
    }

    public int getCurrent_spells_on_field() {
        return current_spells_on_field;
    }

    public MonsterCard[] getMonsters() {
        return monsters;
    }

    public SpellCard[] getSpells() {
        return spells;
    }

    public void cardTurnEffects(Field enemyField){
        for (int i=0 ; i < current_spells_on_field ; i++ )
            spells[i].turnEffect(this, enemyField) ;

        for (int i=0 ; i < current_monsters_on_field ; i++ )
            monsters[i].setCanAttack(true);

    }

    public boolean addMonsterCard(MonsterCard card){
        if (current_monsters_on_field < 5) {
            monsters[current_monsters_on_field] = card ;
            current_monsters_on_field ++ ;
            return true ;
        }
        return false ;
    }

    public void reduceMonsterCard(int whichCard){
        MonsterCard[] result = new MonsterCard[5];
        for (int i = 0 ; i < 5 ; i++)
            result[i] = null ;

        System.arraycopy(monsters, 0, result, 0, whichCard );
        System.arraycopy(monsters, whichCard + 1, result, whichCard, current_monsters_on_field - whichCard - 1 );
        monsters = result ;
        current_monsters_on_field = current_monsters_on_field - 1 ;
    }



    public boolean addSpellCard(SpellCard card) {

        if (current_spells_on_field < 5) {
            spells[current_spells_on_field] = card ;
            current_spells_on_field ++ ;
            return true ;
        }
        return false ;

    }

    public int getCurrent_monsters_on_field() {
        return current_monsters_on_field;
    }

    public void setSpells(SpellCard[] spells) {
        this.spells = spells;
    }

    public void setCurrent_spells_on_field(int current_spells_on_field) {
        this.current_spells_on_field = current_spells_on_field;
    }





}

