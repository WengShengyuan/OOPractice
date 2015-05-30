package duck.duckdesign.behavior.impl.quackbehaviorImpl;

import duck.duckdesign.behavior.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<<Silence>>");
	}

}
