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
public class Card implements Comparable<Card>
{
    public enum Suit {HEARTS, CLUBS,SPADES,DIAMONDS};
    public enum Value{TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE};
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
        return value + " of " + suit;
    }
    
    public String getValue(){
        return "" + value;
    }
    
    public String getSuit(){
        return "" + suit;
    }
    
    @Override
    public int compareTo(Card c){
        int valcomp = Value.valueOf(c.getValue()).ordinal();
        int valplay = Value.valueOf(value+"").ordinal();
        if (valplay<valcomp){
            return 1;//if the player's card is lower than the computer's return 1
        }
        else if(valplay>valcomp){
            return -1;//if the players card is higher, then return -1
        }
        else{
            return 0; //else return 0 if they are equal
        }
    }
}
