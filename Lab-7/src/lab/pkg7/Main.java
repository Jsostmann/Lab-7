/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7;

import javax.swing.JOptionPane;

/**
 *
 * @author jamesostmann
 */
public class Main {
    
     public static void main(String[] args) {
        
        Deck deck = new Deck();
        
        // Print out original deck of Cards
        JOptionPane.showMessageDialog(null,deck,"Original",-1);
        
        // shuffle and print out deck of cards
        deck.shuffle();
        JOptionPane.showMessageDialog(null,deck,"Shuffled",-1);
        
        // sort and print out deck of cards
        deck.sort();
        JOptionPane.showMessageDialog(null,deck,"Sorted",-1);
       
        
    }
}
