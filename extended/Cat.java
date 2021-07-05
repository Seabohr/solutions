package person.extended;

public class Cat {

	public String name;
	public int age;
	public String colour;

	public Cat(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	public Cat() {

	}

	public static void speak() {
		System.out.println("MEOW!");

	}

	public void printCat() {
		System.out.print(name);
		System.out.print(" ");
		System.out.print(age);
		System.out.print(" ");
		System.out.println(colour);

	}

}
