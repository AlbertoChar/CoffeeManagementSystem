package coffeeShopMeals;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import coffeeShopMeals.BagelFactory;
import coffeeShopMeals.LaxBagelFactory;
import coffeeShopMeals.PlainBagelFactory;
import coffeeShopMeals.DoughnutFactory;
import coffeeShopMeals.ChocolateDoughnutFactory;
import coffeeShopMeals.GlazedDoughnutFactory;
import coffeeShopMeals.Meal;
import coffeeShopMeals.State;

public class TemplateTests {
	
	@Test
	public void testLaxBagelTemplate() {
	    BagelFactory laxBagelFactory = new LaxBagelFactory();
	    Meal laxBagel = laxBagelFactory.createBagel();

	    assertThat(laxBagel.getState()).isEqualTo(State.UNPREPARED);
	    laxBagel.assemble();
	    assertThat(laxBagel.getState()).isEqualTo(State.READY);
	}
	
	@Test
	public void testLaxBagelTemplateParts() {
	    BagelFactory laxBagelFactory = new LaxBagelFactory();
	    Meal laxBagel = laxBagelFactory.createBagel();

	    assertThat(laxBagel.getState()).isEqualTo(State.UNPREPARED);
	    laxBagel.getIngredients();
	    assertThat(laxBagel.getState()).isEqualTo(State.RAW);
	    laxBagel.cook();
	    assertThat(laxBagel.getState()).isEqualTo(State.COOKED);
	    laxBagel.serve();
	    assertThat(laxBagel.getState()).isEqualTo(State.READY);
	}
	
	@Test
	public void testPlainBagelTemplate() {
	    BagelFactory plainBagelFactory = new PlainBagelFactory();
	    Meal plainBagel = plainBagelFactory.createBagel();

	    assertThat(plainBagel.getState()).isEqualTo(State.UNPREPARED);
	    plainBagel.assemble();
	    assertThat(plainBagel.getState()).isEqualTo(State.READY);
	}
	
	@Test
	public void testPlainBagelTemplateParts() {
	    BagelFactory plainBagelFactory = new PlainBagelFactory();
	    Meal plainBagel = plainBagelFactory.createBagel();

	    assertThat(plainBagel.getState()).isEqualTo(State.UNPREPARED);
	    plainBagel.getIngredients();
	    assertThat(plainBagel.getState()).isEqualTo(State.RAW);
	    plainBagel.cook();
	    assertThat(plainBagel.getState()).isEqualTo(State.COOKED);
	    plainBagel.serve();
	    assertThat(plainBagel.getState()).isEqualTo(State.READY);
	}

	@Test
	public void testChocolateDoughnutTemplate() {
	    DoughnutFactory doughnutFactory = new ChocolateDoughnutFactory();
	    Meal chocolateDoughnut = doughnutFactory.createDoughnut();

	    assertThat(chocolateDoughnut.getState()).isEqualTo(State.UNPREPARED);
	    chocolateDoughnut.assemble();
	    assertThat(chocolateDoughnut.getState()).isEqualTo(State.READY);
	}
	
	@Test
	public void testChocolateDoughnutTemplateParts() {
	    DoughnutFactory chocolateDoughnutFactory = new ChocolateDoughnutFactory();
	    Meal chocolateDoughnut = chocolateDoughnutFactory.createDoughnut();

	    assertThat(chocolateDoughnut.getState()).isEqualTo(State.UNPREPARED);
	    chocolateDoughnut.getIngredients();
	    assertThat(chocolateDoughnut.getState()).isEqualTo(State.RAW);
	    chocolateDoughnut.cook();
	    assertThat(chocolateDoughnut.getState()).isEqualTo(State.COOKED);
	    chocolateDoughnut.serve();
	    assertThat(chocolateDoughnut.getState()).isEqualTo(State.READY);
	}

	@Test
	public void testGlazedDoughnutTemplate() {
	    DoughnutFactory doughnutFactory = new GlazedDoughnutFactory();
	    Meal glazedDoughnut = doughnutFactory.createDoughnut();

	    assertThat(glazedDoughnut.getState()).isEqualTo(State.UNPREPARED);
	    glazedDoughnut.assemble();
	    assertThat(glazedDoughnut.getState()).isEqualTo(State.READY);
	}
	
	@Test
	public void testGlazedDoughnutTemplateParts() {
	    DoughnutFactory glazedDoughnutFactory = new GlazedDoughnutFactory();
	    Meal glazedDoughnut = glazedDoughnutFactory.createDoughnut();

	    assertThat(glazedDoughnut.getState()).isEqualTo(State.UNPREPARED);
	    glazedDoughnut.getIngredients();
	    assertThat(glazedDoughnut.getState()).isEqualTo(State.RAW);
	    glazedDoughnut.cook();
	    assertThat(glazedDoughnut.getState()).isEqualTo(State.COOKED);
	    glazedDoughnut.serve();
	    assertThat(glazedDoughnut.getState()).isEqualTo(State.READY);
	}
}
