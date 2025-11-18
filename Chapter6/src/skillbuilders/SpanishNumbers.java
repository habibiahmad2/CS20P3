package skillbuilders;

public class SpanishNumbers {

    // This method receives a number and prints the Spanish word for it
    public static void showSpanishWord(int number) {

        if (number == 1) {
            System.out.println("uno");
        } else if (number == 2) {
            System.out.println("dos");
        } else if (number == 3) {
            System.out.println("tres");
        } else if (number == 4) {
            System.out.println("cuatro");
        } else if (number == 5) {
            System.out.println("cinco");
        } else if (number == 6) {
            System.out.println("seis");
        } else if (number == 7) {
            System.out.println("siete");
        } else if (number == 8) {
            System.out.println("ocho");
        } else if (number == 9) {
            System.out.println("nueve");
        } else if (number == 10) {
            System.out.println("diez");
        } else {
            System.out.println("Number not supported.");
        }
    }

    public static void main(String[] args) {

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            showSpanishWord(i);  // Call the method for each number
        }
    }
}
