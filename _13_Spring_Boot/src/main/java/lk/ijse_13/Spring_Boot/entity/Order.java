package lk.ijse_13.Spring_Boot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Order {
    @Id
    private int itemId;
    private String itemName;
    private double price;
    private int qty;
    private int customerId;

}
