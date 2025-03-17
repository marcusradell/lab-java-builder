package src.java.net.radell;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    List<String> toppings;

    public PizzaBuilder() {
        toppings = new ArrayList<>();
        toppings.add("Tomato sauce");
        toppings.add("Mozzarella");
    }


    public PizzaBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    public Pizza build() {
        return new Pizza(this.toppings);
    }
}

