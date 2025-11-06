/*

Program: ????.java          Last Date of this Revision: September 30, 2019

Purpose: An application that uses nested for loops to output a table that diplays number in 
 multiples of ten.

Author: Your Name, 
School: CHHS
Course: Computer Programming ??
 

*/

package mastery;

import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        String textNumber = Integer.toString(number); // turn the number into a string

        for (int i = 0; i < textNumber.length(); i++) {
            System.out.println(textNumber.charAt(i));
        }
    }
}


/* Screen Dump
 
Paste the output of your code here

 
 */