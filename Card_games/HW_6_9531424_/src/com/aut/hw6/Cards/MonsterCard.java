package com.aut.hw6.Cards;

/**
 * Created by Roozbeh Ghasemi on 4/26/2017.
 */
public class MonsterCard extends Card{



    int power ;
    int basePower ;
    boolean canAttack ;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isCanAttack() {
        return canAttack;
    }



    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }

    public MonsterCard(String name, String description,int power,boolean canattack ) {
        super(name, description);
        this.power = power;
        this.canAttack = canattack ;
    }

    public MonsterCard(String name, String description,int power ) {
        super(name, description);
        this.power = power;
        this.canAttack = false ;
    }

    @Override
    public boolean equals(Object acard) {

        if (!(acard instanceof MonsterCard))
            return false ;
        MonsterCard temp_card = (MonsterCard)acard ;

        if (!super.equals(acard)) return false ;

        if (power == temp_card.getPower() && basePower == temp_card.getBasePower())
            return true ;
        else
            return false ;

    }

    @Override
    public String toString() {

        return (super.toString() +   " | power : " + power + " | canattck : " + canAttack) ;
    }

    //is_attacked_in_this_turn   //just one attack in every turn

    //a method for compare Attck power of this card with opponent monster Card
    // if this card power is equal or more than opponent then attack done

    public int getBasePower() {
        return basePower;
    }




}
