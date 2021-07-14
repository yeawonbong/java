import org.opentutorials.iot.Elevator; // Elevator��� class�� import��.
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoHome {

	public static void main(String[] args) {
	
		String id = "JAVA APT 507";
		
		// Elevator Call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id + "/ Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + "/ floor Lamp");
		floorLamp.on();
		
	}
}
