package duck.duckdesign.ducks;

import duck.duckdesign.behavior.impl.flybehaviorImpl.FlyNoWay;
import duck.duckdesign.behavior.impl.quackbehaviorImpl.MuteQuack;
import duck.duckdesign.superduck.Duck;

public class ModelDuck extends Duck{
	public ModelDuck () {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	
	public void display(){
		System.out.println("I'm a model duck");
	}
}
