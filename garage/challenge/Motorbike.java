package garage.challenge;

public class Motorbike extends Vehicle {

	private boolean sport;

	public Motorbike(String name, boolean sport) {
		super("Motorbike", name, 2, 100);
		this.sport = sport;
	}

	// getters and setters
	public boolean getSport() {
		return sport;
	}

	public void setSport(boolean sport) {
		this.sport = sport;
	}

}
