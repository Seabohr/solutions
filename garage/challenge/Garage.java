package garage.challenge;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> vehicles = new ArrayList<>();

	public Vehicle find(String x, boolean ifPrint) {
		for (Vehicle y : vehicles) {
			if (y.getName().equals(x)) {
				Vehicle found = y;
				if (ifPrint) {
					System.out.println(y.toString());
				}
				return found;
			}
		}
		return null;
	}

	public boolean addVehicle(Vehicle x) {
		boolean added = vehicles.add(x);
		return added;
	}

	public Vehicle removeVehicle(String x) {
		return vehicles.remove(vehicles.indexOf(find(x, false)));
	}

	public String listAll() {
		for (Vehicle x : vehicles) {
			System.out.print(x.toString());
		}
		System.out.println(" ");
		return null;
	}

	public String tyreCheck() {
		for (Vehicle x : vehicles) {
			int y = x.getWheels() * 20;
			System.out.println(x.getName() + " £" + y);
		}
		return null;
	}

	public String fix(String x) {
		System.out.println("Total cost to fix " + x + " : £" + find(x, false).getCost());
		return x;
	}

	public void empty() {
		vehicles.clear();
	}

	public void strip(String x) {
		ArrayList<Vehicle> stripVics = new ArrayList<>();
		for (Vehicle y : vehicles) {
			if (y.getType().equals(x)) {
				stripVics.add(y);
			}
		}
		vehicles.removeAll(stripVics);
	}

}
