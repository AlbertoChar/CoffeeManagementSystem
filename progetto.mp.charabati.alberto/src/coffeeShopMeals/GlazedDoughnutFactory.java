package coffeeShopMeals;

public class GlazedDoughnutFactory implements DoughnutFactory {
	
    @Override
    public Doughnut createDoughnut() {
        return new GlazedDoughnut();
    }
}
