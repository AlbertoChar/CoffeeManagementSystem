package coffeeShopMeals;

public class PlainBagelFactory implements BagelFactory {
	
    @Override
    public Bagel createBagel() {
        return new PlainBagel();
    }
}
