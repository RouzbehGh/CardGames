package com.aut.hw6.Cards;

/**
 * Created by Roozbeh Ghasemi on 4/26/2017.
 */

public abstract class Card {

    String name ;
    String description ;


    public Card(String name, String description) {
        this.name = name;
        this.description = description;
    }


    /**
     * @param acard is a kind of object that get for the arguments of the method.
     * @return this method is return a boolean type,like true or false.
     */
    @Override
    public boolean equals(Object acard) {

        if (!(acard  instanceof Card))
            return false ;
        Card temp_card = (Card)acard ;
        if (name.equals(temp_card.getName()) && description.equals(temp_card.getDescription()))
            return true ;
        else
            return false ;

    }


    @Override
    public String toString() {
        return ("name : " + name + " | description : " + description) ;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
