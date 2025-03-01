package lk.ijse_13.Spring_Boot.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Orders  {
    @Id
    private int orderId;

    private Date date;

    private double total;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "orders")
    private List<OrderDetail> orderDetails = new ArrayList<>();


}