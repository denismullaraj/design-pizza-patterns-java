package creational.factory;

/**
 * Created by denis.mullaraj on 18.3.18.
 */
interface Pizza {
    /**
     * Get Pizza Ingredients
     * @return String value representing the ingredients
     */
    String getIngredients();

    /**
     * Get Pizza Price
     * @return double value representing the price
     */
    double getPrice();
}
