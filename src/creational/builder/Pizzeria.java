package creational.builder;

/**
 * Created by denis.mullaraj on 02/04/2018.
 */
public class Pizzeria {

    public static void main(String[] args) {

        Pizza burrata = new Pizza.Builder(Base.ROSSA, Size.ITALIAN)
                .withCrust(Crust.ITALIAN)
                .addTopping(Topping.BURRATA)
                .addTopping(Topping.BASIL)
                .finishWithMagic(Magic.STARDUST)
                .build();

        System.out.println(burrata.toString());
    }

}
