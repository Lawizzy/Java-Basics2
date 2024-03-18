package methodOverriding;

public class AnimalMain {

	public static void main(String[] args) {


		Animal animal = new Animal();
		animal.whatAmI();
		
		Dog dog = new Dog();
		dog.whatAmI();
		
		Cat cat = new Cat();
		cat.whatAmI();
	}

}
