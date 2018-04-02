package creational.builder;

/**
 * Created by denis.mullaraj on 02/04/2018.
 */
public enum Size {

    MEDIUM("25"),
    ITALIAN("30"),
    LARGE("35"),
    FAMILY("40");

    private String size;

    Size(String size){
        this.size = size;
    }

    @Override
    public String toString(){
        return size + "cm";
    }
}
