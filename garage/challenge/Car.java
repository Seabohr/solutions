package garage.challenge;

public class Car extends Vehicle {

	// variables
	private String colour;

	// constructor
	public Car(String name, String colour) {
		super("Car", name, 4, 200);
		this.colour = colour;
	}

	// getters and setters
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
