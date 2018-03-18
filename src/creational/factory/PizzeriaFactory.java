package creational.factory;

/**
 * Created by denis.mullaraj on 18.3.18.
 */
class PizzeriaFactory {

    static final int MARGHERITA = 1;
    static final int BURRATA = 2;

    Pizza getPizza(int pizzaType){
        switch(pizzaType){
            case MARGHERITA:
                return new Margherita();
            case BURRATA:
                return new Burrata();
            default: return null;
        }
    }

}
