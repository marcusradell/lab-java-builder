public class Pizza {
    private Pizza() {
    }

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }

    public static class PizzaBuilder {
        private PizzaBuilder() {
        }

        public Pizza build() {
            return new Pizza();
        }
    }
}
