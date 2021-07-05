package person.extended;

import java.util.ArrayList;

public class Person {

	public String name;
	public int age;
	public String job;

	public ArrayList<Cat> cats = new ArrayList<>();

	public ArrayList<Dog> dogs = new ArrayList<>();

	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}

	// empty object to default to
	public Person() {

	}

	// used boolean object instead of void
	public boolean addCat(Cat x) {
		boolean added = cats.add(x);
		return added;
	}

	// used Cat object instead of void of boolean
	public Cat removeCat(int x) {
		Cat removed = cats.remove(x);
		return removed;
	}

	public boolean addDog(Dog x) {
		boolean added = dogs.add(x);
		return added;

	}

	public Dog removeDog(int x) {
		Dog removed = dogs.remove(x);
		return removed;
	}

	public void print() {
		System.out.print(name);
		System.out.print(" ");
		System.out.print(age);
		System.out.print(" ");
		System.out.print(job);
		System.out.println(" ");

		// invoked cats instance information via Cat
		// this maintains objects
		for (int i = 0; i < cats.size(); i++) {
			System.out.print("Cats: ");
			cats.get(i).printCat();
		}

		for (int i = 0; i < dogs.size(); i++) {
			System.out.print("Dogs: ");
			dogs.get(i).printDog();
		}
	}

}
