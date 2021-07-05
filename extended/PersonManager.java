package person.extended;

import java.util.ArrayList;

public class PersonManager {

	public ArrayList<Person> people = new ArrayList<>();

	// avoid void due to debugging
	public boolean addPerson(Person x) {
		boolean added = people.add(x);
		return added;
	}

	// void removed to avoid void
	public Person removePerson(int x) {
		Person removed = people.remove(x);
		return removed;
	}

	public Person find(String x, boolean ifPrint) {
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i).name == x) {
				Person found = people.get(i);

				if (ifPrint) {
					people.get(i).print();
					System.out.println(" ");
				}
				return found;
			}
		}
		System.out.println("Did not find.");
		System.out.println(" ");
		return null;
	}
}
