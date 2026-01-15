// Add Phidgets Library
import com.phidget22.*;
public class Button {
   // Handle Exceptions
   public static void main(String[] args) throws Exception {
       // Create buttons
       DigitalInput redButton = new DigitalInput();
       DigitalInput greenButton = new DigitalInput();
       // Address RED button
       redButton.setIsHubPortDevice(true);
       redButton.setHubPort(0);
       // Address GREEN button
       greenButton.setIsHubPortDevice(true);
       greenButton.setHubPort(5);
       // Red button event
       redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
           public void onStateChange(DigitalInputStateChangeEvent e) {
               if (e.getState()) {
                   System.out.println("Red Button: Pressed");
               } else {
                   System.out.println("Red Button: Not Pressed");
               }
           }
       });
       // Green button event
       greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
           public void onStateChange(DigitalInputStateChangeEvent e) {
               if (e.getState()) {
                   System.out.println("Green Button: Pressed");
               } else {
                   System.out.println("Green Button: Not Pressed");
               }
           }
       });
       // Open buttons
       redButton.open(1000);
       greenButton.open(1000);
       // Keep program running
       while (true) {
           Thread.sleep(1000); // try 10, 1000, or 5000
       }
   }
}



