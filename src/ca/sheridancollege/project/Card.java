/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public class Card 
{
    public enum Suit {HEARTS, CLUBS,SPADES,DIAMONDS};
    public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
    private Suit suit;
    private Value value;
     /*
     * Students should implement this method for their specific children classes
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
        
    public Card (Suit suit, Value value){
        this.suit = suit;
        this.value = value;
    }
       
    //default modifier for child classes
    @Override
    public String toString(){
        return suit + " of " + value;
    }
}
