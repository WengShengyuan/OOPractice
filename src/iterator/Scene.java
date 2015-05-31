package iterator;

import iterator.simpleiterator.menu.ArrayMenu;
import iterator.simpleiterator.menu.MenuItem;

public class Scene {

	public static void main(String[] args) {
		ArrayMenu menu = new ArrayMenu(new MenuItem[] {new MenuItem("item1", 1.0f), new MenuItem("item2", 2.0f)});
		
		while(menu.hasNext()){
			System.out.println(menu.next());
		}
		
	}

}
