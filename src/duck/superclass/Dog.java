package duck.superclass;

public class Dog extends Animal {

	@Override
	public void makeSound() {
		bark();
	}
	
	private void bark(){
		System.out.println("dogBarks");
	}

}
