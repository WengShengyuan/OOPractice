package duck.duckdesign.behaviorImpl.quackbehaviorImpl;

import duck.duckdesign.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
