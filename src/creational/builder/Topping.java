package creational.builder;

/**
 * Created by denis.mullaraj on 02/04/2018.
 */
public enum Topping {

    ASPARAGUS("asparagus"),
    BACON("bacon"),
    BASIL("basil"),
    BLACK_OLIVES("black olives"),
    BURRATA("burrata"),
    CHEESE("cheese"),
    CHERRY_TOMATO("cherry tomato"),
    CHILI_PEPPER("chili pepper"),
    FRENCH_FRIES("french fries"),
    GREEN_OLIVES("green olives"),
    GRILLED_VEG("grilled vegetables"),
    HAM("ham"),
    HOT_SAUCE("hot sauce"),
    MOZZARELLA("mozzarella"),
    MUSHROOM("mushroom"),
    ONION("onion"),
    OREGANO("oregano"),
    PARMESAN("parmesan"),
    PARSLEY("parsley"),
    PORCINI("porcini"),
    RAW_HAM("raw ham"),
    RICOTTA("ricotta"),
    SHRIMP("shrimp"),
    SPINACH("spinach"),
    TOMATO("tomato"),
    TUNA("tuna"),
    WURSTEL("wrustel"),
    ZUCCHINI("zucchini");

    private String topping;

    Topping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return topping;
    }
}
