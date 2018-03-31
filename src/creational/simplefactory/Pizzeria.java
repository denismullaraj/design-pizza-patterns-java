package creational.simplefactory;

/**
 * Created by denis.mullaraj on 18.3.18.
 */
public class Pizzeria {

    public static void main(String[] args) {
        PizzeriaFactory pizzeriaFactory = new PizzeriaFactory();

        Pizza margherita = pizzeriaFactory.getPizza(PizzeriaFactory.MARGHERITA);
        Pizza burrata = pizzeriaFactory.getPizza(PizzeriaFactory.BURRATA);

        System.out.printf("Pizza Margherita ingredients: %s%n", margherita.getIngredients());
        System.out.printf("Pizza Margherita price: %.1f%n", margherita.getPrice());

        System.out.println();

        System.out.printf("Pizza Burrata ingredients: %s%n", burrata.getIngredients());
        System.out.printf("Pizza Burrata price: %.1f%n", burrata.getPrice());
    }

}
