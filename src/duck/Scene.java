package duck;

import duck.duckdesign.behavior.impl.flybehaviorImpl.FlyWithRocket;
import duck.duckdesign.ducks.MallardDuck;
import duck.duckdesign.ducks.ModelDuck;
import duck.duckdesign.superduck.Duck;

public class Scene {

	public static void main(String[] args) {
		
		System.out.println("-----MallardDuck---------");
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.doFly();
		mallardDuck.swim();
		mallardDuck.doQuack();
		
		System.out.println("-----ModelDuck---------");
		Duck modelDuck = new ModelDuck();
		System.out.println("before set");
		modelDuck.doFly();
		System.out.println("set rocket");
		modelDuck.setFlyBehavior(new FlyWithRocket());
		modelDuck.doFly();
		modelDuck.doQuack();
	}

}
