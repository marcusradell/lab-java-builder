public class Main {
    public static void main(String[] args) {
        var pizza = Pizza.builder()
                .addTopping("Pepperoni")
                .addTopping("Mushroom")
                .build();

        System.out.println("pizza = " + pizza);
    }
}
