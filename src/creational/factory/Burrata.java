package creational.factory;

/**
 * Created by denis.mullaraj on 18.3.18.
 */
public class Burrata implements Pizza {
    @Override
    public String getIngredients() {
        return "Dough, Pomodoro, Burrata, Basilico";
    }

    @Override
    public double getPrice() {
        return 6;
    }
}
