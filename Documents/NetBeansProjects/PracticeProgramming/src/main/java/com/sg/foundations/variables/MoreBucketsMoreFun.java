/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author Karina
 */
public class MoreBucketsMoreFun {
  
     public static void main(String[] args) {
        
        //Declare All THE THINGS
        // (Usually it's a good idea to declare the at the beginning of the programm)
        int butterflies, beetles, bugs;
        
        // Now give a couple of them some values
      
        butterflies = 5;
        
        beetles = 9;
        
        bugs = butterflies + beetles;
        
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are  " + bugs + " bugs in all.");
        
        System.out.println("Uh oh, my dog ate one."); 
        butterflies--; //this’s an unary operator
        System.out.println("Now there are only  " +  butterflies + " butterflies left.");
        System.out.println("But still " + "6 bugs left" + " wait a minute!");
        System.out.println("Maybe my computer can't do math, after all!");
     }
}

