package structural.decorator;

/**
 * Created by denis.mullaraj on 17.3.18.
 */
class BasicPizza implements Pizza {

    @Override
    public String getIngredients() {
        return "Dough";
    }

    @Override
    public double getPrice() {
        return 2;
    }


}
