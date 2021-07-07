package garage.challenge;

public class APC extends Vehicle {

	private boolean modular;

	public APC(String name, boolean modular) {
		super("APC", name, 8, 400);
		this.modular = modular;
	}

	// getters and setters
	public boolean getModular() {
		return modular;
	}

	public void setModular(boolean modular) {
		this.modular = modular;
	}

}
