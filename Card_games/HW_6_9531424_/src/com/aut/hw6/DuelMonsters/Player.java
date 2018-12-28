package com.aut.hw6.DuelMonsters;
import  com.aut.hw6.Cards.*;
/**
 * Created by Roozbeh Ghasemi on 4/26/2017.
 */
public class Player {

    CardDeck mainDeck ;
    SpecialDeck specialDeck ;
    Card[] hand = new Card[5] ;
    int current_valid_lengh_of_hand = 0 ;


    Special nextSpecial= null ;

    int lifePoints ;

    public int getCurrent_valid_lengh_of_hand() {
        return current_valid_lengh_of_hand;
    }


    public int getLifePoints() {
        return lifePoints;
    }

    public Card[] getHand() {
        return hand;
    }

    public Special getNextSpecial() {
        return nextSpecial;
    }



    public Player(CardDeck mainDeck, SpecialDeck specialDeck, int lifePoints) {
        this.mainDeck = mainDeck;
        this.specialDeck = specialDeck;
        this.lifePoints = lifePoints;
    }


    public Player(CardDeck mainDeck, SpecialDeck specialDeck) {
        this.mainDeck = mainDeck;
        this.specialDeck = specialDeck;
        this.lifePoints = 5000;
    }


    public boolean draw(int count) {
        for (int i = 0 ; i < count ; i ++) {
            Object temp = mainDeck.deal() ;
            if (temp == null) return false ;
            hand[current_valid_lengh_of_hand] = (Card)temp ;
            current_valid_lengh_of_hand ++ ;
        }//end for
        return true ;
    }


    public void drawSpecialCard(){
        if (nextSpecial == null) {
            Object temp = specialDeck.deal() ;
            if (temp != null)
                nextSpecial = (Special)temp ;
            else
                nextSpecial = null;
        }

    }

    public void nextTurnPrep() {
        if (current_valid_lengh_of_hand != 5) {
            if (!draw(1))
                lifePoints = lifePoints - 500 ;
        }
        drawSpecialCard();
    }

    public boolean playCardFromHand(int whichCard, Field myField){
        if (whichCard > current_valid_lengh_of_hand-1) return false ;

        if (  (hand[whichCard] instanceof SpellCard )) {

            if (!myField.addSpellCard((SpellCard)hand[whichCard])) return false ;
            Card[] result = new Card[5];
            for (int i = 0 ; i < 5 ; i++)
                result[i] = null ;

            System.arraycopy(hand, 0, result, 0, whichCard );
            System.arraycopy(hand, whichCard + 1, result, whichCard, current_valid_lengh_of_hand - whichCard - 1 );
            hand = result ;
            current_valid_lengh_of_hand = current_valid_lengh_of_hand - 1 ;
            return true ;
        }

        if ( hand[whichCard] instanceof MonsterCard) {
            if(!myField.addMonsterCard((MonsterCard)hand[whichCard])) return false  ;
            Card[] result = new Card[5];
            for (int i = 0 ; i < 5 ; i++)
                result[i] = null ;

            System.arraycopy(hand, 0, result, 0, whichCard);
            System.arraycopy(hand, whichCard + 1, result, whichCard, current_valid_lengh_of_hand - whichCard - 1 );
            hand = result ;
            current_valid_lengh_of_hand = current_valid_lengh_of_hand - 1 ;
            return true ;
        }
        //what happen to trap cards
        return false ;

    }

    // i dont know it is correct
    public boolean playSpecial(Field myField) {
        if ( nextSpecial instanceof MonsterCard) {
            if(!myField.addMonsterCard((MonsterCard)nextSpecial)) return false  ;
        }
        nextSpecial = null ;
        return true ;
    }

    public void changeLifePoints(int change) {
        lifePoints = lifePoints + change ;
    }

    public boolean isDefeated(){
        if(lifePoints <= 0) return true ;
        else return false ;

    }
}
