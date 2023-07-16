package coffeeShopMeals;

import coffeeShop.Preparable;
import coffeeShop.Product;

public abstract class Meal implements Product, Preparable {
    private final String name;
    private double price;
    private String description;
    protected State state;
    
    public Meal(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        state = State.UNPREPARED;
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
    
    public void assemble() {
        getIngredients();
        cook();
        serve();
    }

    protected void serve() {
    	state = State.READY;
    }

    public State getState() {
        return state;
    }
    
    protected abstract void getIngredients();
    
    protected abstract void cook();
    
}
