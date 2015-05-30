package duck.duckdesign.behaviorImpl.flybehaviorImpl;

import duck.duckdesign.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with wings");
	}

}
