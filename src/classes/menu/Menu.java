package classes.menu;

import java.util.ArrayList;

public class Menu {
    ArrayList<Description> descriptions;

    public void addItemDescription(Description description) {
        descriptions.add(description);
    }
}
