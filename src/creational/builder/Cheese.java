package creational.builder;

/**
 * Created by denis.mullaraj on 02/04/2018.
 */
public enum Cheese {

    MOZZARELLA,
    CHEDDAR,
    EDAM,
    EMMENTAL,
    PROVOLONE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
