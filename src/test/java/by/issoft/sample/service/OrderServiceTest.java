package by.issoft.sample.service;

import by.issoft.sample.domain.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    public static List<Order> orderList = new ArrayList<>();

    private OrderService orderService = new OrderService();

    @Test
    void placeOrder() {
        orderService.placeOrder(new Order(), orderList);
        assertEquals(1, orderList.size());
    }

    @Test
    void loadAllByUserId() {
        Order testOrder = new Order(1111L);
        orderService.placeOrder(testOrder, orderList);

        assertEquals(1, orderService.loadAllByUserId(1111L, orderList).size());
    }
}