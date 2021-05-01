package classes.menu;

import java.util.ArrayList;

public class DrinkDescription extends Description{

    public DrinkDescription(
            int number,
            String name,
            ArrayList<IngredientDescription> ingredientDescriptions,
            double price
    ) {
        super(number, name, ingredientDescriptions, price);
    }
}
