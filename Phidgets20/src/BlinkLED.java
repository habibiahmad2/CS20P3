// Add Phidgets Library
import com.phidget22.*;
public class BlinkLED {
   // Handle Exceptions
   public static void main(String[] args) throws Exception {
       // Create LED objects
       DigitalOutput redLED = new DigitalOutput();
       DigitalOutput greenLED = new DigitalOutput();
       // Address RED LED
       redLED.setHubPort(1);
       redLED.setIsHubPortDevice(true);
       // Address GREEN LED
       greenLED.setHubPort(4);
       greenLED.setIsHubPortDevice(true);
       // Open LEDs
       redLED.open(1000);
       greenLED.open(1000);
       // Flash LEDs 3 times
       for(int i = 0; i < 3; i++){
           // Turn LEDs ON
           redLED.setState(true);
           greenLED.setState(true);
           // Stay on for 2 seconds
           Thread.sleep(2000);
           // Turn LEDs OFF
           redLED.setState(false);
           greenLED.setState(false);
           // Pause before next flash
           Thread.sleep(1000);
       }
   }
}



