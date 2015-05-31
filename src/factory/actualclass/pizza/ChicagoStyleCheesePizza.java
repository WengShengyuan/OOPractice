package factory.actualclass.pizza;

import factory.abstractclass.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sause = "Plum Tomato Sause";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	public void cut(){
		System.out.println("Chicago Custom cut");
	}

}
