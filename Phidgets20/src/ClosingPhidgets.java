// Add Phidgets Library
import com.phidget22.*;
public class ClosingPhidgets {
   public static void main(String[] args) throws Exception {
       // Create
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       // Open
       temperatureSensor.open(1000);
       // Print temperature
       System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C");
       // Close Phidget
       temperatureSensor.close();
       // Re-open Phidget
       temperatureSensor.open(1000);
       // Print temperature again (works)
       System.out.println("Temperature after reopening: " + temperatureSensor.getTemperature() + " °C");
       // Close again
       temperatureSensor.close();
   }
}



