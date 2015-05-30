package duck.duckdesign.behavior.impl.flybehaviorImpl;

import duck.duckdesign.behavior.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
