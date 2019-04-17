/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public class Player //Represents the class that the human and computer player will be using
{
    private String playerID; //the unique ID for this player
    private ArrayList<Card> hand;
    
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name, ArrayList hand)
    {
        playerID= name;
        this.hand = hand;
    }
    
    public Card playCard(){
     //removes card from the beginning of the array
        return hand.get(0);
    }
    
    public void addCard(Card c){
        hand.add((hand.size()-1), c);//adds card to the end
    }
    
    public void loseCard(Card c){
        hand.remove(c);
    }
    
    public void clearHand(){
        hand.clear();
    }
    
    /**
     * @return the playerID
     */
    public String getPlayerID() 
    {
        return playerID;
    }
    
    public ArrayList getHand(){
        return hand;
    }
    
    public void setHand(ArrayList newHand){
        hand.clear();
        hand = newHand;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }
    
    public int getHandSize(){
        return hand.size();
    }
    
    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */
    
}
