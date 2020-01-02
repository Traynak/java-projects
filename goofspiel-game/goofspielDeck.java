/*
 * 
 *      Author: Trevor Raynak
 * 
 */

package goofspiel;
import java.util.ArrayList;

public class Deck {

    public static int convertCards(String cardValue){
    switch(cardValue){
        case "ace": return 1;             //returns integer after method has run
        case "jack": return 11;           //these are all card values dealt
        case "queen": return 12;
        case "king": return 13;
        case "2": return 2;
        case "3": return 3;
        case "4": return 4;
        case "5": return 5;
        case "6": return 6;
        case "7": return 7;
        case "8": return 8;
        case "9": return 9;
        case "10": return 10;
        default: return 0;
        }
    }
    
    public static ArrayList<String> orderSuit(){
        ArrayList<String> cards = new ArrayList<String>();  //new deck created with same value cards
        String cardValue;
        for(int cardPlace=0; cardPlace < 13; cardPlace++){
            if (cardPlace == 0){
                cardValue = "ace";
                cards.add(cardPlace, cardValue);
            }
            else
                if (cardPlace == 10){
                    cardValue = "jack";
                    cards.add(cardPlace, cardValue);
                }
            else
                    if (cardPlace == 11){
                        cardValue = "queen";
                        cards.add(cardPlace, cardValue);
                    }
            else
                        if (cardPlace == 12){
                            cardValue = "king";
                            cards.add(cardPlace, cardValue);
                        }
            else{
                           cardValue = "" + (cardPlace + 1); 
                           cards.add(cardPlace, cardValue);
                        }
        }
        
        return cards;
    }
   
    public static ArrayList<String> shuffle(){
        ArrayList<String> cards = new ArrayList<String>();    //creates new deck that will be shuffled
        String cardValue;                                     //cards drawn will be random
        for(int cardPlace=0; cardPlace < 13; cardPlace++){
            if (cardPlace == 0){
                cardValue = "ace";
                cards.add(cardPlace, cardValue);
            }
            else
                if (cardPlace == 10){
                    cardValue = "jack";
                    cards.add(cardPlace, cardValue);
                }
            else
                    if (cardPlace == 11){
                        cardValue = "queen";
                        cards.add(cardPlace, cardValue);
                    }
            else
                        if (cardPlace == 12){
                            cardValue = "king";
                            cards.add(cardPlace, cardValue);
                        }
            else{
                           cardValue = "" + (cardPlace + 1); 
                           cards.add(cardPlace, cardValue);
                        }
        }
        
        int lastCardPlace;                            //this counts card value of turn
        String lastCardValue;                         //puts value in winner's score
        for (int count = 0; count < 13; count++){
            lastCardPlace = (int)(Math.random()*13);
            lastCardValue = cards.get(count);
            cards.set(count, cards.get(lastCardPlace));
            cards.set(lastCardPlace, lastCardValue);
        }
        
        return cards;
    }
    
}