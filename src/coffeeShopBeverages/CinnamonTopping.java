package coffeeShopBeverages;

public class CinnamonTopping extends BeverageDecorator {
	
	public CinnamonTopping(IBeverage decoratedBeverage) throws ToppingAlreadyAddedException {
        	super(BeverageToppingsManager.checkAndAddTopping(decoratedBeverage, CinnamonTopping.class));
        }
    
    @Override
    public double getPrice() {
    	return decoratedBeverage.getPrice() + 0.5;
    }

	@Override
	public String getDescription() {
		return decoratedBeverage.getDescription() + " with cinnamon";
	}
	
	public String toString() {
		return "Cinnamon Topping";
	}
    
}
