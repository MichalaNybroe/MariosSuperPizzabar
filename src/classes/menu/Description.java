package classes.menu;

import java.util.ArrayList;

public abstract class Description {
    private int number;
    private String name;
    private ArrayList<IngredientDescription> ingredientDescriptions;
    private double price;

    public Description(
            int number,
            String name,
            ArrayList<IngredientDescription> ingredientDescriptions,
            double price
    ) {
        this.number = number;
        this.name = name;
        this.ingredientDescriptions = ingredientDescriptions;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public ArrayList<IngredientDescription> getIngredientDescriptions() {
        return ingredientDescriptions;
    }

    public double getPrice() {
        return price;
    }
}
