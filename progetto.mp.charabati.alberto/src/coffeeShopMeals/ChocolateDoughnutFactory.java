package coffeeShopMeals;

public class ChocolateDoughnutFactory implements DoughnutFactory {
	
    @Override
    public Doughnut createDoughnut() {
        return new ChocolateDoughnut();
    }
}
