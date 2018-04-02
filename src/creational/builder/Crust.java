package creational.builder;

/**
 * Created by denis.mullaraj on 02/04/2018.
 */
public enum Crust {

    CLASSIC("classic"),
    THIN_AND_CRISPY("thin and crispy"),
    ITALIAN("italian");

    private String crust;

    Crust(String crust){
        this.crust = crust;
    }

    @Override
    public String toString(){
        return crust;
    }
}
