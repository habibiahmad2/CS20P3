package skillbuilders;
import java.util.Scanner;
public class CountLetter {
   public static void main(String[] args) {
       // Create Scanner for user input
       Scanner input = new Scanner(System.in);
       // Ask user for a phrase instead of a single word
       System.out.println("Enter a phrase:");
       String phrase = input.nextLine();
       int letterCount = 0;
       // Loop through each character in the phrase
       for (int i = 0; i < phrase.length(); i++) {
           char currentChar = phrase.charAt(i);
           // Check if the character is alphabetic
           if (Character.isLetter(currentChar)) {
               letterCount++;
           }
       }
       // Display the results
       System.out.println("The number of letters in the phrase is: " + letterCount);
       input.close();
   }
}
