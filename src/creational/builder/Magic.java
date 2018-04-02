package creational.builder;

/**
 * Created by denis.mullaraj on 02/04/2018.
 */
public enum Magic {

    SOUL,
    STARDUST,
    LOVE,
    JOY;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
