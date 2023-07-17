package coffeeShopMeals;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import coffeeShopMeals.Meal;
import coffeeShopMeals.State;

public class MealTests {
	
    @Test
    public void testMeal() {
        Meal meal = new TestMeal("Breakfast Combo", 8.99, "A combo meal for breakfast");
        assertThat(meal.getName()).isEqualTo("Breakfast Combo");
        assertThat(meal.getPrice()).isEqualTo(8.99);
        assertThat(meal.getDescription()).isEqualTo("A combo meal for breakfast");
        assertThat(meal.getState()).isEqualTo(State.UNPREPARED);

    } 
    
    //Concrete subclass of Meal for testing only
    private static class TestMeal extends Meal {
        public TestMeal(String name, double price, String description) {
            super(name, price, description);
        }

		@Override
		public void prepare() {
		}

		@Override
		protected void getIngredients() {	
		}

		@Override
		protected void cook() {
		}

    }

}
