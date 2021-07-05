package person.extended;

public class Dog {

	public String name;
	public int age;
	public String colour;

	public Dog(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;

	}

	public static void speak() {
		System.out.println("BORK!");

	}

	public void printDog() {
		System.out.print(name);
		System.out.print(" ");
		System.out.print(age);
		System.out.print(" ");
		System.out.println(colour);
	}

}
