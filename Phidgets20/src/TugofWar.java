// Add Phidgets Library
import com.phidget22.*;
public class TugofWar {
   public static void main(String[] args) throws Exception {
       // Create buttons and LEDs
       DigitalInput redButton = new DigitalInput();
       DigitalInput greenButton = new DigitalInput();
       DigitalOutput redLED = new DigitalOutput();
       DigitalOutput greenLED = new DigitalOutput();
       // Address devices (same style as your examples)
       redButton.setHubPort(0);
       redButton.setIsHubPortDevice(true);
       redLED.setHubPort(1);
       redLED.setIsHubPortDevice(true);
       greenButton.setHubPort(5);
       greenButton.setIsHubPortDevice(true);
       greenLED.setHubPort(4);
       greenLED.setIsHubPortDevice(true);
       // Open devices
       redButton.open(1000);
       redLED.open(1000);
       greenButton.open(1000);
       greenLED.open(1000);
       // Counters
       int redCount = 0;
       int greenCount = 0;
       // Track previous button state (prevents holding)
       boolean lastRedState = false;
       boolean lastGreenState = false;
       // Game loop
       while (redCount < 10 && greenCount < 10) {
           boolean redState = redButton.getState();
           boolean greenState = greenButton.getState();
           // Red button press detection
           if (redState && !lastRedState) {
               redCount++;
               System.out.println("Red count: " + redCount);
           }
           // Green button press detection
           if (greenState && !lastGreenState) {
               greenCount++;
               System.out.println("Green count: " + greenCount);
           }
           lastRedState = redState;
           lastGreenState = greenState;
           Thread.sleep(150);
       }
       // Flash BOTH LEDs once
       redLED.setState(true);
       greenLED.setState(true);
       Thread.sleep(500);
       redLED.setState(false);
       greenLED.setState(false);
       Thread.sleep(500);
       // Winner celebration
       if (redCount == 10) {
           System.out.println("RED WINS!");
           flashWinner(redLED);
       } else {
           System.out.println("GREEN WINS!");
           flashWinner(greenLED);
       }
   }
   // Flash winner LED 5 times
   public static void flashWinner(DigitalOutput led) throws Exception {
       for (int i = 0; i < 5; i++) {
           led.setState(true);
           Thread.sleep(300);
           led.setState(false);
           Thread.sleep(300);
       }
   }
}



