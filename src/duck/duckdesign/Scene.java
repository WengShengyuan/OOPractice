package duck.duckdesign;

import duck.duckdesign.ducks.MallardDuck;
import duck.duckdesign.superduck.Duck;

public class Scene {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		
		mallardDuck.display();
		mallardDuck.doFly();
		mallardDuck.swim();
		mallardDuck.doQuack();
	}

}
