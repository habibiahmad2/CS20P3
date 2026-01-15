// Add Phidgets Library
import com.phidget22.*;
public class TempandHumidity {
   public static void main(String[] args) throws Exception{
       // Create HumiditySensor and TemperatureSensor objects
       HumiditySensor humiditySensor = new HumiditySensor();
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       // Open sensors
       humiditySensor.open(1000);
       temperatureSensor.open(1000);
       // Read and evaluate data
       while(true){
           double humidity = humiditySensor.getHumidity();
           double temperature = temperatureSensor.getTemperature();
           // Humidity check
           if(humidity > 30){
               System.out.println("Humidity: " + humidity + " %RH");
           } else {
               System.out.println("Humidity is low");
           }
           // Temperature check
           if(temperature > 21){
               System.out.println("Temperature: " + temperature + " °C");
           } else {
               System.out.println("Room is too cold");
           }
           System.out.println(); // blank line for readability
           Thread.sleep(150);
       }
   }
}



