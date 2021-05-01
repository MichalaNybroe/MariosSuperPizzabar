package classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private LocalDateTime pickUpTime;
    private int orderNumber;
    ArrayList<OrderItem> orderItems;

    public Order(int orderNumber, LocalDateTime pickUpTime, ArrayList<OrderItem> items) {
        this.orderNumber = orderNumber;
        this.pickUpTime = pickUpTime;
        this.orderItems = items;
    }
}
