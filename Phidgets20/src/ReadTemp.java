// Add Phidgets Library
import com.phidget22.*;
public class ReadTemp {
   public static void main(String[] args) throws Exception{
       // Create TemperatureSensor object
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       // Open the temperature sensor
       temperatureSensor.open(1000);
       // Read and convert temperature
       while (true) {
           // Get temperature in Celsius
           double tempC = temperatureSensor.getTemperature();
           // Convert to Fahrenheit
           double tempF = (tempC * 1.8) + 32;
           // Print both values
           System.out.println("Temperature: " + tempC + " °C | " + tempF + " °F");
           Thread.sleep(150);
       }
   }
}



