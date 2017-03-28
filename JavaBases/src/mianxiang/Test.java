package mianxiang;

public class Test {
	public static void main(String[] agrs) {
		Play play = new Play();
		Dog dog = new Dog();
		Run run = new Run();

		/*
		 * play.feed(dog); play.feed(run);
		 */

		Pet pet = new Dog();
		play.feed(pet);

		Pet pet2 = new Run();
		play.feed(pet2);

	}
}
