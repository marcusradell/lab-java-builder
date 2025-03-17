import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private Pizza() {
    }

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }

    public static class PizzaBuilder {
        List<String> toppings;

        private PizzaBuilder() {
            toppings = new ArrayList<>();
            toppings.add("Tomato sauce");
            toppings.add("Mozzarella");
        }

        public PizzaBuilder addTopping(String topping) {
            toppings.add(topping);

            return this;
        }

        public Pizza build() {
            return new Pizza();
        }
    }
}
