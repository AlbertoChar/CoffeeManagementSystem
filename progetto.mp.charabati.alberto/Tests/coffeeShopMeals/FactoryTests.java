package coffeeShopMeals;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import coffeeShopMeals.BagelFactory;
import coffeeShopMeals.ChocolateDoughnutFactory;
import coffeeShopMeals.DoughnutFactory;
import coffeeShopMeals.GlazedDoughnutFactory;
import coffeeShopMeals.Meal;

public class FactoryTests {  
    
    @Test
    public void testFactoryPatternGlazed() {
        DoughnutFactory glazedDoughnutFactory = new GlazedDoughnutFactory();
        Meal glazedDoughnut = glazedDoughnutFactory.createDoughnut();
        assertThat(glazedDoughnut.getName()).isEqualTo("Glazed");
        assertThat(glazedDoughnut.getPrice()).isEqualTo(1.5);    
    }
    
    @Test
    public void testFactoryPatternChocolate() {
        DoughnutFactory chocolateDoughnutFactory = new ChocolateDoughnutFactory();
        Meal chocolateDoughnut = chocolateDoughnutFactory.createDoughnut();
        assertThat(chocolateDoughnut.getName()).isEqualTo("Chocolate");
        assertThat(chocolateDoughnut.getPrice()).isEqualTo(2.0);
    }
    
    @Test
    public void testFactoryPatternLax() {
        BagelFactory laxBagelFactory = new LaxBagelFactory();
        Meal laxBagel = laxBagelFactory.createBagel();
        assertThat(laxBagel.getName()).isEqualTo("Lax");
        assertThat(laxBagel.getPrice()).isEqualTo(2.5);
    }
    
    @Test
    public void testFactoryPatternPlain() {
        BagelFactory plainBagelFactory = new PlainBagelFactory();
        Meal plainBagel = plainBagelFactory.createBagel();
        assertThat(plainBagel.getName()).isEqualTo("Plain");
        assertThat(plainBagel.getPrice()).isEqualTo(1.5);
    }
    
    
}

