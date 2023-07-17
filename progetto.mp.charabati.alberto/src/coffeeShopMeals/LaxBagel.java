package coffeeShopMeals;

class LaxBagel extends Bagel{
	protected LaxBagel() {
		super("Lax", 2.5, "Salmon and creamcheese bagel");
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

