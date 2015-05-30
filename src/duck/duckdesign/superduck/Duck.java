package duck.duckdesign.superduck;

import duck.duckdesign.behavior.FlyBehavior;
import duck.duckdesign.behavior.QuackBehavior;

public class Duck {
	public FlyBehavior flyBehavior; 
	public QuackBehavior quackBehavior;
	
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void doFly(){
		flyBehavior.fly();
	}
	
	public void doQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("superDuck swim");
	}
	
	public void display(){
		System.out.println("superDuck");
	}
}
