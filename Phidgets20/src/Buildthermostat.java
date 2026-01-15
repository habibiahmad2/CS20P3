// Add Phidgets Library
import com.phidget22.*;
public class Buildthermostat {
   public static void main(String[] args) throws Exception {
       // Create sensor, buttons, and LEDs
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       DigitalInput greenButton = new DigitalInput();
       DigitalInput redButton = new DigitalInput();
       DigitalOutput greenLED = new DigitalOutput();
       DigitalOutput redLED = new DigitalOutput();
       // Address buttons
       greenButton.setHubPort(5);
       greenButton.setIsHubPortDevice(true);
       redButton.setHubPort(0);
       redButton.setIsHubPortDevice(true);
       // Address LEDs
       greenLED.setHubPort(4);
       greenLED.setIsHubPortDevice(true);
       redLED.setHubPort(1);
       redLED.setIsHubPortDevice(true);
       // Open devices
       temperatureSensor.open(1000);
       greenButton.open(1000);
       redButton.open(1000);
       greenLED.open(1000);
       redLED.open(1000);
       // Set temperature starts at 21°C
       int setTemperature = 21;
       // Track previous button states
       boolean lastGreenState = false;
       boolean lastRedState = false;
       // Timer for 10-second output
       long lastPrintTime = System.currentTimeMillis();
       // Main loop
       while (true) {
           double currentTemp = temperatureSensor.getTemperature();
           boolean greenState = greenButton.getState();
           boolean redState = redButton.getState();
           // Green button increases set temperature
           if (greenState && !lastGreenState) {
               setTemperature++;
               System.out.println("Set temperature increased to " + setTemperature + " °C");
           }
           // Red button decreases set temperature
           if (redState && !lastRedState) {
               setTemperature--;
               System.out.println("Set temperature decreased to " + setTemperature + " °C");
           }
           lastGreenState = greenState;
           lastRedState = redState;
           // LED logic (within ±2°C)
           if (Math.abs(currentTemp - setTemperature) <= 2) {
               greenLED.setState(true);
               redLED.setState(false);
           } else {
               greenLED.setState(false);
               redLED.setState(true);
           }
           // Print temperatures every 10 seconds
           if (System.currentTimeMillis() - lastPrintTime >= 10000) {
               System.out.println("Current Temperature: " + currentTemp + " °C");
               System.out.println("Set Temperature: " + setTemperature + " °C");
               System.out.println();
               lastPrintTime = System.currentTimeMillis();
           }
           Thread.sleep(150);
       }
   }
}



