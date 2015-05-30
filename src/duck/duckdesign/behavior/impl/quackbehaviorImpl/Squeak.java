package duck.duckdesign.behavior.impl.quackbehaviorImpl;

import duck.duckdesign.behavior.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
