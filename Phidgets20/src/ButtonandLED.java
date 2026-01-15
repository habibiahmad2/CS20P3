// Add Phidgets Library
import com.phidget22.*;
public class ButtonandLED {
   // Global variables
   static boolean turnRedLEDOn = false;
   static boolean turnGreenLEDOn = false;
   static int redPresses = 0;
   static int greenPresses = 0;
   static boolean gameOver = false;
   static boolean flashLEDs = false;
   public static void main(String[] args) throws Exception {
       // Create
       DigitalInput redButton = new DigitalInput();
       DigitalInput greenButton = new DigitalInput();
       DigitalOutput redLED = new DigitalOutput();
       DigitalOutput greenLED = new DigitalOutput();
       // Address
       redButton.setHubPort(0);
       redButton.setIsHubPortDevice(true);
       greenButton.setHubPort(5);
       greenButton.setIsHubPortDevice(true);
       redLED.setHubPort(1);
       redLED.setIsHubPortDevice(true);
       greenLED.setHubPort(4);
       greenLED.setIsHubPortDevice(true);
       // Red button event
       redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
           public void onStateChange(DigitalInputStateChangeEvent e) {
               if (!gameOver && e.getState()) {
                   redPresses++;
                   System.out.println("Red presses: " + redPresses);
                   if (redPresses >= 10) {
                       gameOver = true;
                       flashLEDs = true;
                       System.out.println("🏆 RED WINS THE TUG OF WAR!");
                   }
               }
           }
       });
       // Green button event
       greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
           public void onStateChange(DigitalInputStateChangeEvent e) {
               if (!gameOver && e.getState()) {
                   greenPresses++;
                   System.out.println("Green presses: " + greenPresses);
                   if (greenPresses >= 10) {
                       gameOver = true;
                       flashLEDs = true;
                       System.out.println("🏆 GREEN WINS THE TUG OF WAR!");
                   }
               }
           }
       });
       // Open
       redLED.open(1000);
       greenLED.open(1000);
       redButton.open(1000);
       greenButton.open(1000);
       // Main loop
       while (true) {
           if (flashLEDs) {
               // Flash both LEDs
               redLED.setState(true);
               greenLED.setState(true);
               Thread.sleep(300);
               redLED.setState(false);
               greenLED.setState(false);
               Thread.sleep(300);
           }
           else {
               // Normal gameplay LEDs (off during game)
               redLED.setState(false);
               greenLED.setState(false);
               Thread.sleep(150);
           }
       }
   }
}



