package coffeeShopMeals;

public class LaxBagelFactory implements BagelFactory {
	
    @Override
    public Bagel createBagel() {
        return new LaxBagel();
    }
}