
public class Dog {
	private boolean isAwake;
	
	public Dog() {
		isAwake = true;
	}
	
	/**
	 * @return "woof!" if the dog is awake, otherwise "Zzzz..."
	 */
	public String makeSound() {
		String sound;
		if (isAwake) {
			sound = "woof!";
		} else {
			sound = "Zzzz...";
		}
		return sound;
	}
	
	/**
	 * Puts the dog to sleep
	 */
	public void sleep() {
		isAwake = false;
	}
	
	/**
	 * Wakes the dog up
	 */
	public void wakeUp() {
		isAwake = true;
	}
	
	/**
	 * @return true if the dog is sleeping, otherwise false
	 */
	public boolean isSleeping() {
		return !isAwake;
	}
}
