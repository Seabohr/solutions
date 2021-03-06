package garage.challenge;

public class AppGarage {

	public static void main(String[] args) {

		Garage garage = new Garage();

		garage.addVehicle(new Car("Ford1", "Blue"));
		garage.addVehicle(new Car("Scoda1", "Silver"));
		garage.addVehicle(new Motorbike("Harly1", false));
		garage.addVehicle(new Motorbike("Yamaha1", true));
		garage.addVehicle(new APC("Stryker", true));
		garage.addVehicle(new APC("BTR80", false));

		garage.find("Ford1", true);
		garage.removeVehicle("Scoda1");
		garage.tyreCheck();
		garage.fix("Stryker");
		garage.strip("Motorbike");
		garage.listAll();
		garage.empty();
		garage.listAll();
	}

}
