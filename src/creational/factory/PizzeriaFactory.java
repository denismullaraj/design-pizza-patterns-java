package creational.factory;

/**
 * Created by denis.mullaraj on 18.3.18.
 */
public class PizzeriaFactory {

    public static final int MARGHERITA = 1;
    public static final int BURRATA = 2;

    public Pizza getPizza(int pizzaType){
        switch(pizzaType){
            case MARGHERITA:
                return new Margherita();
            case BURRATA:
                return new Burrata();
            default: return null;
        }
    }

}
