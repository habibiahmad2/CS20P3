// Add Phidgets Library
import com.phidget22.*;
public class DataInterval {
   // Handle Exceptions
   public static void main(String[] args) throws Exception {
       // Create
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       // Temperature Change Event
       temperatureSensor.addTemperatureChangeListener(
           new TemperatureSensorTemperatureChangeListener() {
               public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                   System.out.println("Temperature: " + e.getTemperature() + " °C");
               }
           }
       );
       // Open
       temperatureSensor.open(5000);
       // Set Data Interval to MINIMUM (500 ms)
       temperatureSensor.setDataInterval(500);
       // Keep program running
       while (true) {
           Thread.sleep(150);
       }
   }
}



