/*

Program: Exerscise5.java          Last Date of this Revision: 11/17/2025

Purpose: AddCoins Create an AddCoins application that prompts the user for the number of pennies, nickels, dimes, and quarters, and then displays their total 
dollar amount. The AddCoins application should include a getDollarAmount() method that has four int parameters corresponding to the number of 
pennies, nickels, dimes, and quarters, and returns a String that corresponds to the dollar value of the coins. Note that the String returned should include the
currency sign ($). Application output should look similar to: enter your total coins: Quarters:3 dimes:2 Nickels:1 pennies:8 total: $1.08

Author: Ahmad Shams  
School: CHHS
Course: Computer Programming 
 

*/
package mastery;

import java.util.Scanner;

public class Exerscise5 {

    // This method receives the number of each coin and returns the dollar amount as a String
    public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters) {

        // each coin has a value in dollars
        double total = 0;

        total += pennies * 0.01;
        total += nickels * 0.05;
        total += dimes * 0.10;
        total += quarters * 0.25;

        // format the number with a $ sign
        return "$" + String.format("%.2f", total);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your total coins:");

        System.out.print("Quarters: ");
        int quarters = input.nextInt();

        System.out.print("Dimes: ");
        int dimes = input.nextInt();

        System.out.print("Nickels: ");
        int nickels = input.nextInt();

        System.out.print("Pennies: ");
        int pennies = input.nextInt();

        // call the method to get the total dollar amount
        String total = getDollarAmount(pennies, nickels, dimes, quarters);

        System.out.println("Total: " + total);

        input.close();
    }
}


/* Screen Dump
 
Enter your total coins:
Quarters: 20
Dimes: 17
Nickels: 29
Pennies: 10
Total: $8.25

 
 */
