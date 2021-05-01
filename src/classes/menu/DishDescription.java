package classes.menu;

import java.util.ArrayList;

public class DishDescription extends Description{
    public DishDescription(
            int number,
            String name,
            ArrayList<IngredientDescription> ingredientDescriptions,
            double price
    ) {
        super(number, name, ingredientDescriptions, price);
    }
}
