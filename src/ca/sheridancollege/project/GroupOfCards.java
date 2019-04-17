/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> deck =  new ArrayList<Card>();
    private ArrayList <Card> playerHand =  new ArrayList<Card>();
    private ArrayList <Card> cpHand =  new ArrayList<Card>();
    
    public GroupOfCards()//initializes the deck upon creation
    {
        int countCards = 0;
		for(Card.Suit s: Card.Suit.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                        deck.add(countCards, new Card(s,v));
                        countCards++;
                    }
                }
    }
    
    public void generateHand()
        {
                //end outter for
                Collections.shuffle(deck);
                for (int index = 0; index<(deck.size()); index++){
                    if(index<deck.size()/2){
                        playerHand.add(deck.get(index));
                    }
                    else{
                        cpHand.add(deck.get(index));
                    }
                }
        }//end method
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return deck;
    }
   

    /**
     * @return the size of the group of cards
     */
    public int getSize(ArrayList tempDeck) {
        return tempDeck.size();
    }

    
    public ArrayList getHand(String player){
        if (player.equals("cpu")){
            return cpHand;
        }
        else{
            return playerHand;
        }
    }
    
}//end class
