package iterator.simpleiterator.menu;

import iterator.simpleiterator.interfaces.Iterator;

public class ArrayMenu implements Iterator {

	MenuItem[] items;
	int position = 0;
	
	public ArrayMenu(MenuItem[] items){
		this.items = items;
	}
	
	@Override
	public boolean hasNext() {
		return (!(position >= items.length || items[position] == null));
	}

	@Override
	public Object next() {
		return items[position++];
	}

}
