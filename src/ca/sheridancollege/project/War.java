/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author M_Mus
 */
public class War extends Game {
    
   War(){
       super("War");
   } 
    
  @Override 
   public void play(){
       boolean playing = true;
       Scanner input = new Scanner(System.in);
       GroupOfCards deck = new GroupOfCards();
       deck.generateHand();
       System.out.println("Please enter your name:");
       String name = input.nextLine();
       Player human = new Player(name, deck.getHand(""));
       Player computer = new Player("Computer", deck.getHand("cpu"));//initialize both player's hands
       //Used to test win condition computer.hand.clear();
       while (playing){
           if (human.getHand().isEmpty()){
               System.out.println("The computer wins!");
               break;
           }
           else if(computer.getHand().isEmpty()){
               System.out.println(name+ " wins!");
               break;
           }
           System.out.println("What move would you like to make?");
           System.out.println("1: play");
           System.out.println("2: rules");
           System.out.println("3: count cards in hand");
           System.out.println("4: forfeit");
           int choice = input.nextInt();
           switch(choice){
               case 1:
                   Card pCard = human.playCard();
                   Card cCard = computer.playCard();
                   human.loseCard(pCard);
                   computer.loseCard(cCard);
                   if (pCard.compareTo(cCard)==1){
                       System.out.println("Your " + pCard.toString() + " lost to the computer's " + cCard.toString());
                       computer.addCard(pCard);
                       computer.addCard(cCard);
                       
                   }
                   else if(pCard.compareTo(cCard)==-1){
                       System.out.println("Your " + pCard.toString() + " beat the computer's " + cCard.toString());
                       human.addCard(pCard);
                       human.addCard(cCard);
                       
                   }
                   else{
                       System.out.println("Tie!");
                       System.out.println("You both played a " + cCard.getValue());
                       human.addCard(pCard);
                       computer.addCard(cCard);
                   }
                   break;
                   
               case 2:
                   rules();
                   break;
                
               case 3:
                   System.out.println("You have " + human.getHandSize() + " cards left");
                   break;
                   
               case 4:
                   human.clearHand();
                   break;
               default:
                   System.out.println("Please enter a valid option");
                   break;
                   
           }
           
       }
   }
   
   @Override
   public String rules(){
       return "TODO";
   }
   
   @Override
   public void declareWinner(Player p){
       System.out.println(p.toString() + " wins");
   }
}
