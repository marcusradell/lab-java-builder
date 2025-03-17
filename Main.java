import src.java.net.radell.PizzaBuilder;

public class Main {
    public static void main(String[] args) {
        var pizza = new PizzaBuilder()
                .addTopping("Pepperoni")
                .addTopping("Mushroom")
                .build();


        System.out.println("pizza = " + pizza);
    }
}
