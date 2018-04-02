package creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denis.mullaraj on 02/04/2018.
 */
final class Pizza {

    private final Base base;
    private final Size size;
    private final Crust crust;
    private final Cheese cheese;
    private List<Topping> topping;
    private final Magic magic;

    public Pizza(Builder builder) {
        this.base = builder.base;
        this.size = builder.size;
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.topping = builder.topping;
        this.magic = builder.magic;
    }

    public Base getBase() {
        return base;
    }

    public Size getSize() {
        return size;
    }

    public Crust getCrust() {
        return crust;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public List<Topping> getTopping() {
        return topping;
    }

    public Magic getMagic() {
        return magic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is a typical ")
                .append(base)
                .append(" pizza of size ")
                .append(size);

        if (crust != null) {
            sb.append(" surrounded by ")
                    .append(crust)
                    .append(" crust. ");
        }

        if (cheese != null) {
            sb.append("With softly and yummy ")
                    .append(cheese)
                    .append(" cheese. ");
        }

        if (topping != null) {
            sb.append("In addition it has the following specialities on top: ");
            for (int i = 0; i<topping.size(); i++) {
                sb.append(topping.get(i));
                if (i < topping.size() - 1){
                    sb.append(", ");
                }
            }
            sb.append(". ");
        }

        if (magic != null) {
            sb.append("And lastly, of course, it is maid with lots of ")
                    .append(magic)
                    .append("!");
        }

        return sb.toString();
    }

    /**
     * Builder class
     */
    public static class Builder {

        private final Base base;
        private final Size size;
        private Crust crust;
        private Cheese cheese;
        private List<Topping> topping = new ArrayList<>();
        private Magic magic;

        public Builder(Base base, Size size) {
            if (base == null && size == null) {
                throw new IllegalArgumentException("base and size can't be null!");
            }
            this.base = base;
            this.size = size;
        }

        public Builder withCrust(Crust crust) {
            this.crust = crust;
            return this;
        }

        public Builder withCheese(Cheese cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder addTopping(Topping topping) {
            this.topping.add(topping);
            return this;
        }

        public Builder finishWithMagic(Magic magic) {
            this.magic = magic;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }
}
