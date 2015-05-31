package factory;

import factory.abstractclass.pizza.Pizza;
import factory.abstractclass.store.PizzaStore;
import factory.actualclass.store.MyPizzaStore;

public class Scene {

	public static void main(String[] args) {
		PizzaStore myStore = new MyPizzaStore();
		
		Pizza pizza = myStore.orderPizza("NY");
		System.out.println(String.format("Here is the [** %s **]", pizza.getName()));
		
		System.out.println("-------------------------");
		
		Pizza pizza2 = myStore.orderPizza("CH");
		System.out.println(String.format("Here is the [** %s **]", pizza2.getName()));
		
	}

}
