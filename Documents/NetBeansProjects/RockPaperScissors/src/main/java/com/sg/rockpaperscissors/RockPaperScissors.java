/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.rockpaperscissors;

import java.util.Scanner;

/**
 *
 * @author Karina
 */
public class RockPaperScissors {
     
    static int NUM_OF_ROUND = 0;

    static int wins = 0;
    static int loses = 0;
    static int ties = 0;

    static final int Rock = 1;      
    static final int Paper= 2; 
    static final int Scissors = 3;     

    static int[] varSet = {Rock, Paper, Scissors};
    static String[] nameSet = {"Rock", "Paper", "Scissors"};


    static int oneOfVarSet() {
        return varSet[(int) (Math.random() * varSet.length)];
    }

    static void oneCycle(Scanner scanner) {

        String myChoice = scanner.nextLine().toLowerCase();
        int myChoiceInt;

        if (        myChoice.startsWith("r")) {
            myChoiceInt = Rock;
        
        } 
        else if ( myChoice.startsWith("p")) {
            myChoiceInt = Paper;
            
            
            
            
        } else if ( myChoice.startsWith("s")) {
            myChoiceInt = Scissors;

        

        } else {
            System.out.println("- - -");
            return;
        }

        int coChoiceInt = oneOfVarSet();

        System.out.printf("Me - %s\n", nameSet[myChoiceInt >> 1]);
        System.out.printf("Co - %s\n", nameSet[coChoiceInt >> 1]);

        if ((myChoiceInt ^ coChoiceInt) == 0) {
            ties++;
            System.out.println("TIE");

        } else if ( ((myChoiceInt << 1) & (coChoiceInt + (coChoiceInt << varSet.length))) == 0) {
            loses++;
            System.out.println("LOSE");
        } else {
            wins++;
            System.out.println("WIN");
        }

    }

    public static void main(String[] args) {
        while (true) {


            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number of rounds >> ");
            NUM_OF_ROUND = Integer.parseInt(scanner.nextLine());

            if (NUM_OF_ROUND < 1 || 10 < NUM_OF_ROUND) {
                System.out.println("Error, incorrect number of rounds");
                return;
            }

            for (int i = 0; i < NUM_OF_ROUND; i++) {
                System.out.printf("Round - %s%n", i);
                System.out.println("PRINT 'R', 'p' or 'S'");
                oneCycle(scanner);
                System.out.print("\n");
            }

            System.out.println("Your score: " + wins);
            System.out.println("Computer score: " + loses);
            System.out.println("Ties: " + ties);

            System.out.print("Total result: ");

            if (wins == loses){
                System.out.println("Tie");
            }
            else if (wins > loses){
                System.out.println("You won");
            }
            else if (wins < loses){
                System.out.println("Computer won");
            }

            System.out.println("\nDo you want to play again (Yes/No)");

            if (scanner.next().toLowerCase().startsWith("n")) {
                break;
            }
            else{
                for (int i = 0; i < 20; i++){
                    System.out.println();
                }
            }
        }
    }
}



















    /*System.out.println("Enter number of rounds:  ");
      int round = 10;
    System.out.println("Let's start!");
    
    if (round < 10){
    int round  = sc.nextInt();
      sc.close();
    System.out.println("Incorrect! Try again" + round)
      }*/
    
    


      