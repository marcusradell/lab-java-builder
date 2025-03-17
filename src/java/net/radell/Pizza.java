package src.java.net.radell;

import java.util.Arrays;
import java.util.List;

public class Pizza {
    private final List<String> toppings;

    protected Pizza(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return Arrays.toString(toppings.toArray());
    }
}
