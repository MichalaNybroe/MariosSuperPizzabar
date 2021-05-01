package classes;

import java.util.ArrayList;

public class OrderItem {
    private double price;
    private Discount discount;
    private ArrayList<Item> items;

    public OrderItem(double price, Discount discount, ArrayList<Item> items) {
        this.price = price;
        this.discount = discount;
        this.items = items;
    }
}
