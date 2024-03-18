package polymorphism;

public class AnimalMain {

	public static void main(String[] args) {


		Animal animal = new Animal();
		animal.whatAmI();
		
		animal = new Dog();
		animal.whatAmI();
		
		animal = new Cat();
		animal.whatAmI();
	}

}
