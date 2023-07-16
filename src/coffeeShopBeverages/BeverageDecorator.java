package coffeeShopBeverages;

public abstract class BeverageDecorator implements IBeverage {
    protected IBeverage decoratedBeverage;

    public BeverageDecorator(IBeverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
        this.decoratedBeverage.addTopping(this);
    }

    public IBeverage getDecoratedBeverage() {
        return decoratedBeverage;
    }

    public void prepare() {
        decoratedBeverage.prepare();
    }
    
    public void pour() {
    	decoratedBeverage.pour();
    }
    
    public String getName() {
    	return decoratedBeverage.getName();
    }
    
    public Iterable<BeverageDecorator> getToppingsIterator() {
        return decoratedBeverage.getToppingsIterator();
    }
    
    public void addTopping(BeverageDecorator topping) {
        decoratedBeverage.addTopping(topping);
    }


}
