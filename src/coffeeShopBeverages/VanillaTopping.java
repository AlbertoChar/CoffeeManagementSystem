package coffeeShopBeverages;

public class VanillaTopping extends BeverageDecorator {
	
    public VanillaTopping(IBeverage decoratedBeverage) throws ToppingAlreadyAddedException {
    	super(BeverageToppingsManager.checkAndAddTopping(decoratedBeverage, VanillaTopping.class));
    }
    
    @Override
    public double getPrice() {
    	return decoratedBeverage.getPrice() + 0.75;
    }

	@Override
	public String getDescription() {
		return decoratedBeverage.getDescription() + " with vanilla";
	}
	
	public String toString() {
		return "Vanilla Topping";
	}

}

