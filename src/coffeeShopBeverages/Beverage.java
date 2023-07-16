package coffeeShopBeverages;

public abstract class Beverage implements IBeverage {
    private final String name;
    private double price;
    private String description;
    private BeverageToppingsManager toppings;

    protected Beverage(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.toppings = new BeverageToppingsManager();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public Iterable<BeverageDecorator> getToppingsIterator() {
        return this.toppings;
    }
    
    public void addTopping(BeverageDecorator topping) {
    	this.toppings.addTopping(topping);
    }

	public void pour() {
	}

}
