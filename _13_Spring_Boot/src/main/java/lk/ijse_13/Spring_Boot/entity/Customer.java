package lk.ijse_13.Spring_Boot.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    private int customerId;
    private String name;
    private String address;
    private int age;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "customer")
    private List<OrderDetail> orderDetails
            = new ArrayList<>();


    public Customer() {
    }

    public Customer(int customerId, String name, String address, int age, List<OrderDetail> orderDetails) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.age = age;
        this.orderDetails = orderDetails;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
