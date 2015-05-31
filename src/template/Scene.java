package template;

import template.abstractclass.CaffeineBeverage;
import template.actualbeverage.Tea;

public class Scene {

	public static void main(String[] args) {
		Tea myTea = new Tea();
		myTea.prepareRecipe();
		
	}

}
