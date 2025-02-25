package lk.ijse_13.Spring_Boot.entity;

import jakarta.persistence.*;
import lk.ijse_13.Spring_Boot.embeded.OrderDetailPK;

@Entity
public class OrderDetail {
/*
    @EmbeddedId
    private OrderDetailPK orderDetailPK;
*/

    @Id
    private int orderDetailId;

    private int qty;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "itemId")
    private Item item;

    public OrderDetail() {
    }

    public OrderDetail(int orderDetailId, int qty, double unitPrice, Customer customer, Item item) {
        this.orderDetailId = orderDetailId;
        this.qty = qty;
        this.customer = customer;
        this.item = item;
    }

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
