package coffeeShopBeverages;

import coffeeShop.Preparable;
import coffeeShop.Product;

public interface IBeverage extends Preparable, Product {
	
	public Iterable<BeverageDecorator> getToppingsIterator();
	
	public void addTopping(BeverageDecorator topping);
	
	public void pour();

}
