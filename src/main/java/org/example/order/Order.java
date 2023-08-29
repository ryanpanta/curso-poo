package org.example.order;

import org.example.person.user.User;

public class Order {

    private User user;
    private String orderID;

    public Order() {
    }

    public Order(User user, String orderID) {
        this.user = user;
        this.orderID = orderID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
}
