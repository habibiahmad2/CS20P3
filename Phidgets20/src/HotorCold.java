// Add Phidgets Library
import com.phidget22.*;
public class HotorCold {
   public static void main(String[] args) throws Exception{
       // Create TemperatureSensor and LED objects
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       DigitalOutput greenLED = new DigitalOutput();
       DigitalOutput redLED = new DigitalOutput();
       // Address LEDs
       greenLED.setHubPort(4);
       greenLED.setIsHubPortDevice(true);
       redLED.setHubPort(1);
       redLED.setIsHubPortDevice(true);
       // Open devices
       temperatureSensor.open(1000);
       greenLED.open(1000);
       redLED.open(1000);
       // Monitor temperature
       while(true){
           double temperature = temperatureSensor.getTemperature();
           // Output exact temperature
           System.out.println("Temperature: " + temperature + " °C");
           // Temperature range check
           if(temperature >= 20 && temperature <= 24){
               greenLED.setState(true);
               redLED.setState(false);
           } else {
               greenLED.setState(false);
               redLED.setState(true);
           }
           Thread.sleep(150);
       }
   }
}



