package org.example.main;


import org.example.order.Order;
import org.example.person.user.User;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ryan", "Rodrigues", LocalDate.of(2002, 6, 5), "ryanpanta", "123456");
        System.out.println(user1.describe());
        System.out.println(user1.getAge());

        User user2 = User.of("Jessica", "Paes", LocalDate.of(1999, 05, 11));
        System.out.println(user2.getPassword());
        System.out.println(user2.getUsername());

        Order order1 = new Order();
        Order order2 = new Order();

        order1.setUser(user1);
        order2.setUser(user1);

        order1.setOrderID("100");
        order2.setOrderID("101");

        user1.addOrder(order1);
        user1.addOrder(order2);

        for(Order order : user1.getOrders()) {
            System.out.println(order.getOrderID());
        }

    }
}