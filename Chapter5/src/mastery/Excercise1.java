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

public class Excercise1  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = 0; // will count how many times the number divides evenly

        // test all numbers from 1 up to the number itself
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // check if it divides evenly
                count = count + 1;
            }
        }

        // a prime number divides evenly only twice: by 1 and itself
        if (count == 2) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}


/* Screen Dump
 
Paste the output of your code here

Enter a number: 751
751 is a prime number.
 
 */
