public class Label {

    private final String labelName;
    private final int calories;
    private final int sugar;
    private final int fat;

    public static class Builder {
        // ! must have parameters
        private final String labelName;
        private final int calories;
        // ! optional parameters
        private int sugar;
        private int fat;

        public Builder(String name, int calories) {
            this.labelName = name;
            this.calories = calories;
        }

        public Builder addSugar(int sugar) {
            this.sugar = sugar;
            return this;
        }

        public Builder addFat(int fat) {
            this.fat = fat;
            return this;
        }

        public Label build() {
            return new Label(this);
        }

    }

    private Label(Builder source) {
        this.labelName = source.labelName;
        this.calories = source.calories;
        this.sugar = source.sugar;
        this.fat = source.fat;
    }
}

// Label.Builder("Coca Cola",
// "100").addFat(0).addProtein(0).addSugar(90).build()