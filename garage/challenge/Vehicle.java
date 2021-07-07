package garage.challenge;

public abstract class Vehicle {

	// variables
	private String type;
	private String name;
	private int wheels;
	private int cost;

	// constructor
	public Vehicle(String type, String name, int wheels, int cost) {
		super();
		this.type = type;
		this.name = name;
		this.wheels = wheels;
		this.cost = cost;
	}

	// default constructor
	public Vehicle() {
		super();
	}

	// getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "type=" + this.type + ", name=" + this.name + ", wheels=" + this.wheels + ", cost=" + this.cost + "\n";
	}

}
