package coffeeShopBeverages;

public class CaramelTopping extends BeverageDecorator{

    public CaramelTopping(IBeverage decoratedBeverage) throws ToppingAlreadyAddedException {
    	super(BeverageToppingsManager.checkAndAddTopping(decoratedBeverage, CaramelTopping.class));
    }
    
    @Override
    public double getPrice() {
    	return decoratedBeverage.getPrice() + 1.5;
    }

	@Override
	public String getDescription() {
		return decoratedBeverage.getDescription() + " with caramel";
	}
	
	public String toString() {
		return "Caramel Topping";
	}
    

}
