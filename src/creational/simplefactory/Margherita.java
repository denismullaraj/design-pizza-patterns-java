package creational.simplefactory;

/**
 * Created by denis.mullaraj on 18.3.18.
 */
class Margherita implements Pizza {
    @Override
    public String getIngredients() {
        return "Dough, Pomodoro, Mozzarella, Basilico";
    }

    @Override
    public double getPrice() {
        return 4;
    }

}
