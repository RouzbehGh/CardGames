package com.aut.hw6.DuelMonsters;
/**
 * Created by Roozbeh Ghasemi on 4/27/2017.
 */
public abstract class ObjectDeck {

    Object[] objects_of_deck ;

    public ObjectDeck(Object[] objects_of_deck) {
        this.objects_of_deck = objects_of_deck;
    }

    public Object deal() {
        if (objects_of_deck.length == 0) return null ;
        Object[] result = new Object[objects_of_deck.length - 1];
        System.arraycopy(objects_of_deck, 0, result, 0, result.length );
        Object ret_object = objects_of_deck[objects_of_deck.length - 1]  ;
        objects_of_deck = result ;
        return ret_object;
    }

    int size (){

        return objects_of_deck.length ;
    }

    boolean isEmpty(){

        if( objects_of_deck.length == 0) return true ;
        else return false ;

    }
}


