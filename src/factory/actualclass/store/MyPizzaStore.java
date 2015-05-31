package factory.actualclass.store;

import factory.abstractclass.pizza.Pizza;
import factory.abstractclass.store.PizzaStore;
import factory.actualclass.pizza.ChicagoStyleCheesePizza;
import factory.actualclass.pizza.NYStyleCheesePizza;

public class MyPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("NY")){
			return new NYStyleCheesePizza();
		} else if (type.equals("CH")){
			return new ChicagoStyleCheesePizza();
		} else 
			return null;
	}

	

}
