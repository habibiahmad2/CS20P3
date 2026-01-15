// Add Phidgets Library
import com.phidget22.*;
public class SmartPhidget {
   // Store latest values
   static double currentTemperature = 0;
   static double currentHumidity = 0;
   public static void main(String[] args) throws Exception {
       // Create
       HumiditySensor humiditySensor = new HumiditySensor();
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       // Humidity Event
       humiditySensor.addHumidityChangeListener(
           new HumiditySensorHumidityChangeListener() {
               public void onHumidityChange(HumiditySensorHumidityChangeEvent e) {
                   currentHumidity = e.getHumidity();
                   printValues();
               }
           }
       );
       // Temperature Event
       temperatureSensor.addTemperatureChangeListener(
           new TemperatureSensorTemperatureChangeListener() {
               public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                   currentTemperature = e.getTemperature();
                   printValues();
               }
           }
       );
       // Open
       humiditySensor.open(1000);
       temperatureSensor.open(1000);
       // Keep program running
       while (true) {
           Thread.sleep(150);
       }
   }
   // Print both values on one line
   public static void printValues() {
       if (currentTemperature > 21) {
           System.out.println(
               "Temperature: " + currentTemperature + " °C | Humidity: " + currentHumidity + " %RH"
           );
       } else {
           System.out.println(
               "Room is too cold | Humidity: " + currentHumidity + " %RH"
           );
       }
   }
}



