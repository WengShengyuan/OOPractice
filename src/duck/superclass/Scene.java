package duck.superclass;

import duck.superclass.abstractanimal.Animal;
import duck.superclass.animals.Dog;

public class Scene {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.makeSound();
	}

}
