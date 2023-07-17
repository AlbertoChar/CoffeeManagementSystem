package coffeeShopBeverages;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import coffeeShopBeverages.Americano;
import coffeeShopBeverages.Beverage;
import coffeeShopBeverages.Cappuccino;
import coffeeShopBeverages.Matcha;

public class BeverageTests {
	
    @Test
    public void testAmericano() {
        Beverage americano = new Americano();
        assertThat(americano.getName()).isEqualTo("Americano");
        assertThat(americano.getPrice()).isEqualTo(2.5);
        assertThat(americano.getToppingsIterator()).isEmpty();
        assertThat(americano.getDescription()).isEqualTo("A shot of espresso with hot water");
    }
    
    @Test
    public void testCappuccino() {
        Beverage cappuccino = new Cappuccino();
        assertThat(cappuccino.getName()).isEqualTo("Cappuccino");
        assertThat(cappuccino.getPrice()).isEqualTo(4);
        assertThat(cappuccino.getToppingsIterator()).isEmpty();
        assertThat(cappuccino.getDescription()).isEqualTo("Espresso with steamed milk and milk foam");
    }
    
    @Test
    public void testMatcha() {
        Beverage matcha = new Matcha();
        assertThat(matcha.getName()).isEqualTo("Matcha");
        assertThat(matcha.getPrice()).isEqualTo(3.5);
        assertThat(matcha.getToppingsIterator()).isEmpty();
        assertThat(matcha.getDescription()).isEqualTo("A Japanese green tea powder");
    }

}
