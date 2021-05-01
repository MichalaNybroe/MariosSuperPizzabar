package classes.menu;

public class ExtraDescription extends IngredientDescription {
    private double price;

    public ExtraDescription(String name, double price) {
        super(name);
        this.price = price;
    }
}
