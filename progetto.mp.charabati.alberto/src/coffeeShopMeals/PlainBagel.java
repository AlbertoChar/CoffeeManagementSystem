package coffeeShopMeals;

class PlainBagel extends Bagel{
	protected PlainBagel() {
		super("Plain", 1.5, "Fresh plain bagel");
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