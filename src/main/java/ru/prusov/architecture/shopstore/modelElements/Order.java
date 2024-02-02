package ru.prusov.architecture.shopstore.modelElements;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Order {
    {
        id = ++counter;
    }

    //region Constructor
    public Order(String address, String phone, Buyer buyer, Collection<OrderItem> items) {
        this.address = address;
        this.phone = phone;
        this.buyer = buyer;
        this.items = items;
    }
    //endregion

    //region Getters & Setters

    public int getId() {
        return id;
    }

    public Collection<OrderItem> getItems() {
        return items;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Buyer getBuyer() {
        return buyer;
    }

//endregion

    //region Fields
    private static int counter =0;
    private int id;
    private Date orderDate;
    private final String address;
    private final String phone;
    private final Buyer buyer;

    private Collection<OrderItem> items = new HashSet<>();
    //endregion
}
