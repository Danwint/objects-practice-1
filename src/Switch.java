/**
 * This class represents an on/off switch.  
 */
public class Switch {
	private boolean switchIsOn;
	public Switch() {
		switchIsOn = false;
	}
	
	/**
	 * Turns the switch on.
	 */
	public void turnOn() {
		switchIsOn = true;
	}
	
	/**
	 * Turns the switch off.
	 */
	public void turnOff() {
		switchIsOn = false;
	}
	
	/**
	 * @return true if the switch is currently on, otherwise false
	 */
	public boolean isOn() {
		return switchIsOn;
	}
	
	/**
	 * @return true if the switch is currently off, otherwise false
	 */
	public boolean isOff() {
		return !switchIsOn;
	}
}
