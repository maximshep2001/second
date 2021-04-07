package by.issoft.sample.service;

import by.issoft.sample.domain.Order;
import by.issoft.sample.persistence.OrderStorage;

import java.util.List;

public class OrderValidator {

    private OrderStorage orderStorage = new OrderStorage();

    public boolean validateForCreation(Order order) {
        return order.getOrderId() == null;
    }

    public boolean validateForAvailability(Order order, List<Order> orderList){
        return orderStorage.findOrder(order, orderList) == null;
    }

}