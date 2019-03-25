/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author jamesostmann
 */
public class Deck {
    
    ArrayList<Card> cards;
    
    public Deck() {
        
        cards = new ArrayList<>();
        initializeDeck();
    }
    
    private void initializeDeck(){
    
    makeCardSuit("RED");
    makeCardSuit("GREEN");
    makeCardSuit("BLUE");
    makeCardSuit("YELLOW");
    
    }
    
    
    public void shuffle() {
        
       for(int i = 0; i < 7; i++) { 
        
           randomize(cards);
       }
    }
    public void sort(){
        Collections.sort(cards);
    }
    
    @Override 
    public String toString() {
    
    String result = "";
    int counter = 0;
    
    for(Card temp: cards) {
        
        if(counter == 15) {
                
                result += System.lineSeparator();
                counter = 0;
            }

            
            result += temp + "|";
            counter++;
        
    }
        return result;
   }
    
    private void randomize(ArrayList<Card> cards) {
    
    
        for(int i = 0; i < cards.size(); i++) {
        
            int randNum = new Random().nextInt(cards.size() - 1);
            
            Card currentCard = cards.get(i);
            Card tempCard = cards.get(randNum);
            
            
            cards.set(i,tempCard);
            cards.set(randNum,currentCard);
            
        }
        
    }
    private void makeCardSuit(String c) {
       
       cards.add(new Card(c,"0"));
        
       for(int i = 0; i < 2; i++) { 
           
        for(int j = 1; j <= 9; j++) {
        
            cards.add(new Card(c,String.valueOf(j)));
            
        }
        
       }
        
    }
    
   
}
