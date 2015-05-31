package factory.abstractclass.pizza;

import java.util.ArrayList;

public abstract class Pizza {
	
	public String name;
	public String dough;
	public String sause;
	public ArrayList toppings = new ArrayList();
	
	public void prepare(){
		System.out.println(String.format("Preparing %s", name));
		System.out.println(String.format("Tossing dough: %s", dough));
		System.out.println(String.format("Adding sause: %s", sause));
		System.out.println(String.format("Adding toppings: %s", toppings));
	}
	
	public void bake() {
		System.out.println("Baking");
	}
	
	public void cut() {
		System.out.println("Cutting pizza");
	}
	
	public void box () {
		System.out.println("Boxing pizza");
	}
	
	public String getName() {
		return name;
	}
	

}
