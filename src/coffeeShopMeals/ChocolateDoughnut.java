package coffeeShopMeals;

class ChocolateDoughnut extends Doughnut {
    protected ChocolateDoughnut() {
        super("Chocolate", 2.0, "Doughnut filled with chocolate");
    }

    @Override
    public void prepare() {
    }

	@Override
	protected void getIngredients() {
	    this.state = State.RAW;
	}

	@Override
	protected void cook() {
		this.state = State.COOKED;
	}
}
