package duck.duckdesign.behaviorImpl.quackbehaviorImpl;

import duck.duckdesign.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
