package coffeeShopMeals;

class GlazedDoughnut extends Doughnut {
    protected GlazedDoughnut() {
        super("Glazed", 1.5, "Doughnut with glaze on top");
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

