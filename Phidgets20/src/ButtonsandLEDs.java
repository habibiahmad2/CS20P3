// Add Phidgets Library
import com.phidget22.*;
public class ButtonsandLEDs {
   // Handle Exceptions
   public static void main(String[] args) throws Exception{
       // Create button and LED objects
       DigitalInput redButton = new DigitalInput();
       DigitalInput greenButton = new DigitalInput();
       DigitalOutput redLED = new DigitalOutput();
       DigitalOutput greenLED = new DigitalOutput();
       // Address devices
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
       // Button press counters
       int redPresses = 0;
       int greenPresses = 0;
       // Store previous button states
       boolean lastRedState = false;
       boolean lastGreenState = false;
       // Main loop
       while(true){
           boolean redState = redButton.getState();
           boolean greenState = greenButton.getState();
           // Count button presses (false → true)
           if(redState && !lastRedState){
               redPresses++;
               System.out.println("Red Button Presses: " + redPresses);
           }
           if(greenState && !lastGreenState){
               greenPresses++;
               System.out.println("Green Button Presses: " + greenPresses);
           }
           // Swap controls + reverse logic
           // Green button controls RED LED (LED ON when button released)
           redLED.setState(!greenState);
           // Red button controls GREEN LED (LED ON when button released)
           greenLED.setState(!redState);
           lastRedState = redState;
           lastGreenState = greenState;
           Thread.sleep(150);
       }
   }
}



