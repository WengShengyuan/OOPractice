package factory.actualclass.pizza;

import factory.abstractclass.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza{
	
	public NYStyleCheesePizza () {
		name = "NY Style Cheese Pizza";
		dough = "Thin Crust Dough";
		sause = "Marinara Sause";
		toppings.add("Grated Reggiano Cheese");
	}
	
}
