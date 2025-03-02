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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderDetailId;

    private int qty;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "itemId")
    private Item item;

    public OrderDetail() {
    }

    public OrderDetail(int orderDetailId, int qty, Orders orders, Item item) {
        this.orderDetailId = orderDetailId;
        this.qty = qty;
        this.orders = orders;
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

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
