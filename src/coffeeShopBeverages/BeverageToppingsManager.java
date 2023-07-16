package coffeeShopBeverages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BeverageToppingsManager implements Iterable<BeverageDecorator> {
    private List<BeverageDecorator> toppings;

    public BeverageToppingsManager() {
        this.toppings = new ArrayList<>();
    }
     
    public Iterator<BeverageDecorator> iterator() {
        return toppings.iterator();
    }
    
    protected void addTopping(BeverageDecorator topping) {
    	toppings.add(topping);
    }
    
    protected static IBeverage checkAndAddTopping(IBeverage decoratedBeverage, Class<? extends BeverageDecorator> toppingClass)
            throws ToppingAlreadyAddedException {
        Iterable<BeverageDecorator> toppingsIterator = decoratedBeverage.getToppingsIterator();

        for (BeverageDecorator currentTopping : toppingsIterator) {
            if (currentTopping.getClass().equals(toppingClass)) {
                String toppingName = toppingClass.getSimpleName();
                throw new ToppingAlreadyAddedException(toppingName + " has already been added to the beverage.");
            }
        }
        return decoratedBeverage;
    }
    

}
