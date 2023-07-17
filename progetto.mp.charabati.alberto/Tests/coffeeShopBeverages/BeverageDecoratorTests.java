package coffeeShopBeverages;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.Test;

import coffeeShopBeverages.Americano;
import coffeeShopBeverages.BeverageDecorator;
import coffeeShopBeverages.Cappuccino;
import coffeeShopBeverages.CaramelTopping;
import coffeeShopBeverages.CinnamonTopping;
import coffeeShopBeverages.IBeverage;
import coffeeShopBeverages.Matcha;
import coffeeShopBeverages.VanillaTopping;
import coffeeShopBeverages.ToppingAlreadyAddedException;

public class BeverageDecoratorTests {
	
    @Test
    public void testDecoratorCappuccino() throws ToppingAlreadyAddedException {
        IBeverage cappuccinoCaramelCinnamon = new CaramelTopping(new CinnamonTopping(new Cappuccino()));
        assertThat(cappuccinoCaramelCinnamon.getDescription()).isEqualTo("Espresso with steamed milk and milk foam with cinnamon with caramel");
        assertThat(cappuccinoCaramelCinnamon.getName()).isEqualTo("Cappuccino");
        assertThat(cappuccinoCaramelCinnamon.getToppingsIterator()).hasSize(2);
        assertThat(cappuccinoCaramelCinnamon.getPrice()).isEqualTo(6);
        assertThat(cappuccinoCaramelCinnamon.getToppingsIterator())
                .extracting(BeverageDecorator::toString)
                .containsExactlyInAnyOrder("Cinnamon Topping", "Caramel Topping");

        assertThatThrownBy(() -> new CinnamonTopping(cappuccinoCaramelCinnamon)).isInstanceOf(ToppingAlreadyAddedException.class)
        .hasMessage("CinnamonTopping has already been added to the beverage.");
        assertThatThrownBy(() -> new CaramelTopping(cappuccinoCaramelCinnamon)).isInstanceOf(ToppingAlreadyAddedException.class)
        .hasMessage("CaramelTopping has already been added to the beverage.");

        assertThat(cappuccinoCaramelCinnamon.getToppingsIterator()).hasSize(2);
    }

    @Test
    public void testDecoratorMatcha() throws ToppingAlreadyAddedException {
        IBeverage matchaVanilla = new VanillaTopping(new Matcha());
        assertThat(matchaVanilla.getDescription()).isEqualTo("A Japanese green tea powder with vanilla");
        assertThat(matchaVanilla.getName()).isEqualTo("Matcha");
        assertThat(matchaVanilla.getToppingsIterator()).hasSize(1);
        assertThat(matchaVanilla.getPrice()).isEqualTo(4.25);
        assertThat(matchaVanilla.getToppingsIterator())
                .extracting(BeverageDecorator::toString)
                .containsExactlyInAnyOrder("Vanilla Topping");

        assertThatThrownBy(() -> new VanillaTopping(matchaVanilla)).isInstanceOf(ToppingAlreadyAddedException.class)
        .hasMessage("VanillaTopping has already been added to the beverage.");

        assertThat(matchaVanilla.getToppingsIterator()).hasSize(1);
    }


    @Test
    public void testDecoratorAmericano() throws ToppingAlreadyAddedException {
        IBeverage americanoCinnamon = new CinnamonTopping(new Americano());
        assertThat(americanoCinnamon.getDescription()).isEqualTo("A shot of espresso with hot water with cinnamon");
        assertThat(americanoCinnamon.getName()).isEqualTo("Americano");
        assertThat(americanoCinnamon.getPrice()).isEqualTo(3);
        assertThat(americanoCinnamon.getToppingsIterator())
                .extracting(BeverageDecorator::toString)
                .containsExactlyInAnyOrder("Cinnamon Topping");

        assertThatThrownBy(() -> new CinnamonTopping(americanoCinnamon)).isInstanceOf(ToppingAlreadyAddedException.class)
        .hasMessage("CinnamonTopping has already been added to the beverage.");


        assertThat(americanoCinnamon.getToppingsIterator()).hasSize(1);

        IBeverage americanoCinnamonVanilla = new VanillaTopping(americanoCinnamon);
        assertThat(americanoCinnamonVanilla.getDescription()).isEqualTo("A shot of espresso with hot water with cinnamon with vanilla");
        assertThat(americanoCinnamonVanilla.getPrice()).isEqualTo(3.75);
        assertThat(americanoCinnamonVanilla.getToppingsIterator())
                .extracting(BeverageDecorator::toString)
                .containsExactlyInAnyOrder("Cinnamon Topping", "Vanilla Topping");

        assertThatThrownBy(() -> new VanillaTopping(americanoCinnamonVanilla)).isInstanceOf(ToppingAlreadyAddedException.class)
        .hasMessage("VanillaTopping has already been added to the beverage.");

        assertThat(americanoCinnamonVanilla.getToppingsIterator()).hasSize(2);

        IBeverage americanoCinnamonVanillaCaramel = new CaramelTopping(americanoCinnamonVanilla);
        assertThat(americanoCinnamonVanillaCaramel.getDescription()).isEqualTo("A shot of espresso with hot water with cinnamon with vanilla with caramel");
        assertThat(americanoCinnamonVanillaCaramel.getPrice()).isEqualTo(5.25);
        assertThat(americanoCinnamonVanillaCaramel.getToppingsIterator())
                .extracting(BeverageDecorator::toString)
                .containsExactlyInAnyOrder("Cinnamon Topping", "Vanilla Topping", "Caramel Topping");

        assertThatThrownBy(() -> new CinnamonTopping(americanoCinnamonVanillaCaramel)).isInstanceOf(ToppingAlreadyAddedException.class);
        assertThatThrownBy(() -> new VanillaTopping(americanoCinnamonVanillaCaramel)).isInstanceOf(ToppingAlreadyAddedException.class);
        assertThatThrownBy(() -> new CaramelTopping(americanoCinnamonVanillaCaramel)).isInstanceOf(ToppingAlreadyAddedException.class);

        assertThat(americanoCinnamonVanillaCaramel.getToppingsIterator()).hasSize(3);
        assertThat(americanoCinnamonVanillaCaramel.getToppingsIterator())
        .extracting(BeverageDecorator::toString)
        .containsExactlyInAnyOrder("Cinnamon Topping", "Vanilla Topping", "Caramel Topping");
    }

    
}

