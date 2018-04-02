package creational.builder;

/**
 * Created by denis.mullaraj on 02/04/2018.
 */
public enum Base {

    BIANCA,
    ROSSA;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
