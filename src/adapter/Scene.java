package adapter;

import adapter.adapter.TurkeyAdapter;
import adapter.classs.MallardDuck;
import adapter.classs.WildTurkey;
import adapter.interfaces.Duck;

public class Scene {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck fakeDuck = new TurkeyAdapter(turkey); 
		
		System.out.println("turkey:");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nduck:");
		duck.quack();
		duck.fly();
		
		System.out.println("\nfakeDuck:");
		fakeDuck.quack();
		fakeDuck.fly();
		
		
	}

}
