package duck.superclass.animals;

import duck.superclass.abstractanimal.Animal;

public class Dog extends Animal {

	@Override
	public void makeSound() {
		bark();
	}
	
	private void bark(){
		System.out.println("dogBarks");
	}

}
