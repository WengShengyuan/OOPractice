package decorater;

import decorater.beverage.abstractbeverage.Beverage;
import decorater.beverage.actualbeverage.Espresso;
import decorater.beverage.actualbeverage.HouseBlend;
import decorater.decorater.actualdecorater.Mocha;


public class Scene {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(String.format("This is %s: %s$", beverage.getDescription(), beverage.cost()));
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		System.out.println(String.format("This is %s: %s$", beverage2.getDescription(), beverage2.cost()));
	}
}
