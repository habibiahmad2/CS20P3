/*
Program: MySavings.java          Last Date of this Revision: December, 3, 2025
Purpose: Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and
quarters into a piggy bank and then prompts the user to make a selection.
Author: Ahmad Tabish Shams,
School: CHHS
Course: Computer Programming 20
*/
package mastery;
import java.util.Scanner;
public class Exercise1Test {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Exercise1 bank = new Exercise1();   // create a piggy bank
       int choice = -1;
       while (choice != 0) {
           System.out.println("1: Show total in bank");
           System.out.println("2: Add a penny");
           System.out.println("3: Add a nickel");
           System.out.println("4: Add a dime");
           System.out.println("5: Add a quarter");
           System.out.println("6: Take money out of bank");
           System.out.println("Enter 0 to quit");
           System.out.print("Enter your choice: ");
           choice = input.nextInt();
           if (choice == 1) {
               System.out.println("Total in bank: $" + bank.getTotal());
           }
           else if (choice == 2) {
               bank.addPenny();
           }
           else if (choice == 3) {
               bank.addNickel();
           }
           else if (choice == 4) {
               bank.addDime();
           }
           else if (choice == 5) {
               bank.addQuarter();
           }
           else if (choice == 6) {
               bank.takeMoneyOut();
               System.out.println("Bank emptied.");
           }
           else if (choice != 0) {
               System.out.println("Invalid choice.");
           }
           System.out.println(); // blank line for neat formatting
       }
       System.out.println("Goodbye!");
   }
}
/*Screen Dump
1: Show total in bank
2: Add a penny
3: Add a nickel
4: Add a dime
5: Add a quarter
6: Take money out of bank
Enter 0 to quit
Enter your choice: 5
1: Show total in bank
2: Add a penny
3: Add a nickel
4: Add a dime
5: Add a quarter
6: Take money out of bank
Enter 0 to quit
Enter your choice: 0
Goodbye!
1: Show total in bank
2: Add a penny
3: Add a nickel
4: Add a dime
5: Add a quarter
6: Take money out of bank
Enter 0 to quit
Enter your choice: 1
Total in bank: $0.0
1: Show total in bank
2: Add a penny
3: Add a nickel
4: Add a dime
5: Add a quarter
6: Take money out of bank
Enter 0 to quit
Enter your choice: 0
Goodbye!
*/


