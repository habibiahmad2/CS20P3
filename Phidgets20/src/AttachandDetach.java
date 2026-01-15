// Add Phidgets Library
import com.phidget22.*;
public class AttachandDetach {
   public static void main(String[] args) throws Exception {
       // Create
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       DigitalInput button = new DigitalInput();
       DigitalOutput led = new DigitalOutput();
       // Address button and LED
       button.setHubPort(0);
       button.setIsHubPortDevice(true);
       led.setHubPort(1);
       led.setIsHubPortDevice(true);
       // Temperature Change Event
       temperatureSensor.addTemperatureChangeListener(
           new TemperatureSensorTemperatureChangeListener() {
               public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                   System.out.println("Temperature: " + e.getTemperature() + " °C");
               }
           }
       );
       // -------- ATTACH EVENTS --------
       temperatureSensor.addAttachListener(new AttachListener() {
           public void onAttach(AttachEvent e) {
               System.out.println("Attach: Temperature Sensor");
           }
       });
       button.addAttachListener(new AttachListener() {
           public void onAttach(AttachEvent e) {
               System.out.println("Attach: Button");
           }
       });
       led.addAttachListener(new AttachListener() {
           public void onAttach(AttachEvent e) {
               System.out.println("Attach: LED");
           }
       });
       // -------- DETACH EVENTS --------
       temperatureSensor.addDetachListener(new DetachListener() {
           public void onDetach(DetachEvent e) {
               System.out.println("Detach: Temperature Sensor");
           }
       });
       button.addDetachListener(new DetachListener() {
           public void onDetach(DetachEvent e) {
               System.out.println("Detach: Button");
           }
       });
       led.addDetachListener(new DetachListener() {
           public void onDetach(DetachEvent e) {
               System.out.println("Detach: LED");
           }
       });
       // Open
       temperatureSensor.open(1000);
       button.open(1000);
       led.open(1000);
       // Keep program running
       while (true) {
           Thread.sleep(150);
       }
   }
}



