package by.issoft.sample.persistence;

import by.issoft.sample.domain.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderStorageTest {

    private OrderStorage orderStorage = new OrderStorage();
    private static List<Order> orderList = new ArrayList<>();

    @Test
    void addOrder() {
        orderStorage.addOrder(new Order(), orderList);
        assertEquals(1, orderList.size());
    }

    @Test
    void findOrderByUserId() {
        orderStorage.addOrder(new Order(111L), orderList);
        List<Order> orders = orderStorage.findOrderByUserId(111L, orderList);
        assertEquals(1, orders.size());
    }

    @Test
    void findOrder() {
        Order newOrder = new Order();
        orderStorage.addOrder(newOrder, orderList);
        List<Order> orders = orderStorage.findOrder(newOrder, orderList);
        assertEquals(1, orders.size());
    }


    @Test
    void persist() {
        orderStorage.persist(new Order());
    }

    @Test
    void load() {
        orderStorage.load("111");
    }
}