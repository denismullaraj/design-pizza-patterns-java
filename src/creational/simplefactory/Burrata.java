package creational.simplefactory;

/**
 * Created by denis.mullaraj on 18.3.18.
 */
class Burrata implements Pizza {
    @Override
    public String getIngredients() {
        return "Dough, Pomodoro, Burrata, Basilico";
    }

    @Override
    public double getPrice() {
        return 6;
    }
}
