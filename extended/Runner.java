package person.extended;

public class Runner {

	public static void main(String[] args) {

		Person person = new Person();
		PersonManager personManager = new PersonManager();

		person.addCat(new Cat("Fluffer", 5, "Brindle"));
		person.addCat(new Cat("Molly", 8, "Grey"));

		person.removeCat(0);

		person.addDog(new Dog("Hay", 7, "Blonde"));
		person.addDog(new Dog("Dash", 4, "Blue"));

		person.removeDog(0);

		personManager.addPerson(new Person("Grace", 48, "Astronaught"));
		personManager.addPerson(new Person("Harry", 32, "Caddy"));
		personManager.addPerson(new Person("Bob", 74, "Burger flipper"));

		personManager.people.get(0).addDog(new Dog("Bonny", 3, "Blonde"));
		personManager.people.get(2).addCat(new Cat("Mr Fluff", 5, "Pearl White"));
		personManager.people.get(2).addCat(new Cat("Mr Tinkles", 2, "Cheese"));

		personManager.find("Bob", false).addDog(new Dog("Hay", 7, "Blonde"));

		personManager.removePerson(1);

		personManager.find("Grace", true);
		personManager.find("Alice", true);
		personManager.find("Bob", true);

	}

}
