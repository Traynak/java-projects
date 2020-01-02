/*
 * 
 *      Author: Trevor Raynak
 * 
 */

package goofspiel;
import java.util.ArrayList;
import goofspiel.Deck;
import java.util.Scanner;

public class Goofspiel {
    public static void main (String [] args){
        
        Deck mainDeck;         //the 3 objects are created from the Deck class
        Deck myDeck;           //they represent 3 different car decks
        Deck robotDeck;         
        
        mainDeck = new Deck();
        ArrayList<String> mainValues = mainDeck.shuffle(); //this shuffles the main deck 
        
        myDeck = new Deck();
        ArrayList<String> myValues = myDeck.orderSuit();  //this creates my deck
        
        robotDeck = new Deck();
        ArrayList<String> robotValues = robotDeck.orderSuit(); //this creates the robot's deck
        
        Scanner scan = new Scanner (System.in);             //imported scanner
        
        int myScore = 0;                                    //defines integers
        int robotScore = 0;
     
        for(int count=0; count<10; count++){          //this allows 10 plays in the game
            if (count==9){
                System.out.println("LAST HAND:"); 
        }
            else{
                System.out.println("HAND " + (count+1) + ":");
            }
            System.out.println("THIS IS YOUR DECK OF CARDS\n:" + myValues);
            
            int mainCardPlace = (int)(Math.random()*        //puts random card for main deck
                    (int)(mainValues.size()));              
            String mainCard = mainValues.get(mainCardPlace);
            System.out.println("\nCARD DRAWN: " + mainCard);
            
            mainValues.remove(mainCardPlace);            //this removes the card from main deck after play
            
            System.out.println("BET HERE: ");  //this gives me ability to bet
            String bet = scan.nextLine();       //Scanner enables me to type  
            
            int removedPlace = myValues.indexOf("" + bet);  //this removes the card you bet from your deck
            myValues.remove(removedPlace);
            
            int changeMethod = count;                  //determines robots strategy for game

            String robotBet;                            //makes the robot's method matching the main card for beginning 5 hands
            if (changeMethod==0 || changeMethod==1 || changeMethod==2 || 
                    changeMethod==3 || changeMethod==4)
            {
                robotBet = mainCard;
                int robotBetPlace = robotValues.indexOf("" + 
                        robotBet);
                System.out.println("ROBOT HAS PLACED BET: " + robotBet);
                robotValues.remove(robotBetPlace); 
            }
            else{                                            //has robot use random strategy for card choice
                int robotBetPlace = (int)(Math.random()* 
                        (int)(robotValues.size()));
                robotBet = robotValues.get(robotBetPlace);
                System.out.println("ROBOT HAS PLACED BET: " + robotBet);
                robotValues.remove(robotBetPlace);
            }
            
            if ((Deck.convertCards(bet))>(Deck.convertCards(robotBet))){  //calculates scores for every hand
                myScore += Deck.convertCards(mainCard);                   //for both me and robot
            }
            else
                if((Deck.convertCards(robotBet))>(Deck.convertCards(bet))){
                    robotScore += Deck.convertCards(mainCard);
                }
            System.out.println("\n\nMY SCORE: " + myScore);
            System.out.println("ROBOT SCORE: " + robotScore + "\n\n\n\n\n");  //i use backslash n for spacing
            
            if ((count==9) && (myScore > robotScore)){              //the following section calculates the winner based on higher score
                System.out.println("\n\n\nYOU WIN");                //prints you win if i have higher score after 10 hands
            }
            else
                if((count==9) && (robotScore > myScore)){
                    System.out.println("\n\n\nROBOT WINS. YOU LOSE.");  //prints robot wins if i have lower score after 10 hands
                }
            else
                    if(count==9){
                        System.out.println("\n\n\nGAME IS A DRAW.");    //prints you game is a draw if equal score after 10 hands
                    }
        }
        

    }
}
