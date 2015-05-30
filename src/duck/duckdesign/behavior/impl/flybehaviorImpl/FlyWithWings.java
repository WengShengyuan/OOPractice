package duck.duckdesign.behavior.impl.flybehaviorImpl;

import duck.duckdesign.behavior.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with wings");
	}

}
