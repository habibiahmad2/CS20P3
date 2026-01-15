// Add Phidgets Library
import com.phidget22.*;
public class ReadButton {
   // Handle Exceptions
   public static void main(String[] args) throws Exception{
       // Create button objects
       DigitalInput redButton = new DigitalInput();
       DigitalInput greenButton = new DigitalInput();
       // Address RED button
       redButton.setHubPort(0);
       redButton.setIsHubPortDevice(true);
       // Address GREEN button
       greenButton.setHubPort(5);
       greenButton.setIsHubPortDevice(true);
       // Open buttons
       redButton.open(1000);
       greenButton.open(1000);
       // Store previous states
       boolean lastRedState = false;
       boolean lastGreenState = false;
       // Choose loop speed (change this value)
       int delay = 10;      // try 10, 1000, or 5000
       // Read buttons
       while(true){
           boolean redState = redButton.getState();
           boolean greenState = greenButton.getState();
           // Only print when state changes
           if(redState != lastRedState){
               System.out.println("Red Button: " + redState);
               lastRedState = redState;
           }
           if(greenState != lastGreenState){
               System.out.println("Green Button: " + greenState);
               lastGreenState = greenState;
           }
           Thread.sleep(delay);
       }
   }
}



