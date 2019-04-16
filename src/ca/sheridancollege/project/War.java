/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
import java.util.Scanner;

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
       Scanner input = new Scanner(System.in);
       GroupOfCards deck = new GroupOfCards();
       while (true){
           int choice = input.nextInt();
           System.out.println("What move would you like to make?");
           System.out.println("1: play");
           System.out.println("2: shuffle");
           System.out.println("3: Forfeit");
           
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
