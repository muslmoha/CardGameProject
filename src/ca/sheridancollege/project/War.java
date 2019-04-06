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
       int choice = input.nextInt();
       while (true){
           System.out.println("What move would you like to make?");
           System.out.println("1: play");
           System.out.println("2: shuffle");
           System.out.println("3: Forfeit");
           //switch(choice){
               //todo
           //}
       }
   }
   
   @Override
   public String rules(){
       return null;
   }
   
   @Override
   public void declareWinner(){
       System.out.println("You won");
   }
}
