package org.example.person.user;

import org.example.order.Order;
import org.example.person.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User extends Person {
    private String username;
    private String password;
    private List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order orderToBeAdded) {
        this.orders.add(orderToBeAdded);
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String firstName, String lastName, LocalDate dateOfBirth, String username, String password) {
        super(firstName, lastName, dateOfBirth);
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public static User of(String firstName, String lastName, LocalDate dateOfBirth) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setDateOfBirth(dateOfBirth);

        user.setPassword((firstName + lastName).toUpperCase());
        user.setUsername((firstName.charAt(0) + lastName).toLowerCase());
        return user;
    }
}
