/*

Program: Exercise5.java          Last Date of this Revision: 12/8/2025

Purpose: The game of Nim starts with a random number of stones between 15 and 30. 
Two players alternateturns and on each turn may take either 1, 2, or 3 stones from 
the pile. The player forced to take the laststone loses. Use object-oriented 
development to create a Nim2 application that allows the user to play
Nim against the computer. The Nim2 application and its objects should:
• Generate the number of stones to begin with.
• Allow the player to go first.
• Use a random number generator to determine the number of stones the computer
takes.
• Prevent the player and the computer from taking an illegal number of stones. For
example, neither should be allowed to take three stones when there are only 1 or 2
left

Author: Ahmad Shams
School: CHHS
Course: Computer Programming ??
 

*/
package mastery;

import java.util.Scanner;

public class Exercise5Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Exercise5 pile = new Exercise5();  // ✅ Uses the class

        int playerPick;
        int computerPick;

        System.out.println("Welcome to the Game of Nim!");
        System.out.println("The player who takes the LAST stone LOSES.");
        System.out.println("Starting stones: " + pile.getStones());

        while (pile.getStones() > 0) {

            // -------- PLAYER TURN --------
            System.out.print("\nPick 1, 2, or 3 stones: ");
            playerPick = input.nextInt();

            while (playerPick < 1 || playerPick > 3 || playerPick > pile.getStones()) {
                System.out.print("Illegal move. Try again: ");
                playerPick = input.nextInt();
            }

            pile.removeStones(playerPick);
            System.out.println("Stones left: " + pile.getStones());

            if (pile.getStones() == 0) {
                System.out.println("\nYou took the last stone.");
                System.out.println("YOU LOSE. Computer Wins!");
                break;
            }

            // -------- COMPUTER TURN --------
            computerPick = (int)(Math.random() * 3) + 1;

            while (computerPick > pile.getStones()) {
                computerPick = (int)(Math.random() * 3) + 1;
            }

            System.out.println("\nComputer takes " + computerPick + " stones.");
            pile.removeStones(computerPick);
            System.out.println("Stones left: " + pile.getStones());

            if (pile.getStones() == 0) {
                System.out.println("\nComputer took the last stone.");
                System.out.println("YOU WIN!");
                break;
            }
        }

        input.close();
    }
}

/* Screen Dump
 
Welcome to the Game of Nim!
The player who takes the LAST stone LOSES.
Starting stones: 29

Pick 1, 2, or 3 stones: 3
Stones left: 26

Computer takes 2 stones.
Stones left: 24

Pick 1, 2, or 3 stones: 2
Stones left: 22

Computer takes 2 stones.
Stones left: 20

Pick 1, 2, or 3 stones: 1
Stones left: 19

Computer takes 1 stones.
Stones left: 18

Pick 1, 2, or 3 stones: 5
Illegal move. Try again: 2
Stones left: 16

Computer takes 2 stones.
Stones left: 14

Pick 1, 2, or 3 stones: 1
Stones left: 13

Computer takes 2 stones.
Stones left: 11

Pick 1, 2, or 3 stones: 1
Stones left: 10

Computer takes 3 stones.
Stones left: 7

Pick 1, 2, or 3 stones: 3
Stones left: 4

Computer takes 2 stones.
Stones left: 2

Pick 1, 2, or 3 stones: 1
Stones left: 1

Computer takes 1 stones.
Stones left: 0

Computer took the last stone.
YOU WIN!

 
 */
