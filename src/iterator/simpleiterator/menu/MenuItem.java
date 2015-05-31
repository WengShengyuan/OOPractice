package iterator.simpleiterator.menu;

public class MenuItem {
	
	private String name;
	private float price;
	
	public MenuItem(String name, float price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public float getPrice() {
		return price;
	}
	
	public String toString(){
		return String.format("Item: %s, %s$", name, price );
	}
	
}
