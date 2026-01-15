// Add Phidgets Library
import com.phidget22.*;
public class LEDBrightness {
   // Handle Exceptions
   public static void main(String[] args) throws Exception {
       // Create
       DigitalOutput redLED = new DigitalOutput();
       // Address
       redLED.setHubPort(1);
       redLED.setIsHubPortDevice(true);
       // Open
       redLED.open(1000);
       // ---- Duty Cycle Examples ----
       // Duty Cycle = 0 (LED OFF)
       redLED.setDutyCycle(0.0);
       Thread.sleep(1000);
       // Duty Cycle = 0.5 (Medium brightness)
       redLED.setDutyCycle(0.5);
       Thread.sleep(1000);
       // Duty Cycle = 1 (Full brightness)
       redLED.setDutyCycle(1.0);
       Thread.sleep(1000);
       // ---- Slowly increase brightness ----
       for(double dc = 0.0; dc <= 1.0; dc += 0.05){
           redLED.setDutyCycle(dc);
           Thread.sleep(100);
       }
       // ---- Slowly decrease brightness ----
       for(double dc = 1.0; dc >= 0.0; dc -= 0.05){
           redLED.setDutyCycle(dc);
           Thread.sleep(100);
       }
       // Turn LED off
       redLED.setDutyCycle(0.0);
   }
}



