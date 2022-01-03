package chapter08.confirm;

public class SoundableExample {
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

	private static void printSound(Soundable soundable) {
		soundable.sound();
	}
}
