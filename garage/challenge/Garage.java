package garage.challenge;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> vehicles = new ArrayList<>();

	public boolean addVehicle(Vehicle x) {
		boolean added = vehicles.add(x);
		return added;
	}

	public Vehicle removeVehicle(int x) {
		Vehicle removed = vehicles.remove(x);
		return removed;
	}

	public String listAll() {
		for (Vehicle x : vehicles) {
			System.out.print(x.toString());
		}
		System.out.println(" ");
		return null;
	}

	public String billTyreCheck() {
		for (Vehicle x : vehicles) {
			int y = x.getWheels() * 20;
			System.out.println(x.getName() + " £" + y);
		}
		return null;
	}

	public Vehicle find(String x) {
		for (Vehicle y : vehicles) {
			if (y.getName().equals(x)) {
				Vehicle found = y;
			}
			return found;
		}
		return null;
	}

	public String fix(String x) {
		x.find(x);
	}

}
