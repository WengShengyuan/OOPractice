package duck.duckdesign.ducks;

import duck.duckdesign.behavior.impl.flybehaviorImpl.FlyWithWings;
import duck.duckdesign.behavior.impl.quackbehaviorImpl.Quack;
import duck.duckdesign.superduck.Duck;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	public void display(){
		System.out.println("I'm a Mallard Duck");
	}
	
}
