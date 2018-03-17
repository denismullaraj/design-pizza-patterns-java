package structural.decorator;

/**
 * Created by denis.mullaraj on 17.3.18.
 */

public class Pizzeria {

    public static void main(String[] args) {
        Pizza pizzaMargherita = new Mozzarella(new Pomodoro(new BasicPizza()));
        Pizza pizzaFunghi = new Mushroom(new Mozzarella(new Pomodoro(new BasicPizza())));

        System.out.printf("Pizza Margherita ingredients: %s%n", pizzaMargherita.getIngredients());
        System.out.printf("Pizza Margherita price: %.1f%n", pizzaMargherita.getPrice());

        System.out.println();

        System.out.printf("Pizza Funghi ingredients: %s%n", pizzaFunghi.getIngredients());
        System.out.printf("Pizza Funghi price: %.1f%n", pizzaFunghi.getPrice());
    }

}