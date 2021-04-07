package by.issoft.sample.service;

import by.issoft.sample.domain.Order;
import by.issoft.sample.domain.OrderStatus;
import by.issoft.sample.persistence.OrderStorage;

import java.rmi.UnexpectedException;
import java.util.List;
import java.util.Optional;

import static com.google.common.base.Preconditions.checkState;

public class OrderService {

    private OrderStorage orderStorage = new OrderStorage();
    private OrderValidator orderValidator = new OrderValidator();

    private Order createOrder(){
        return new Order();
    }

    public void placeOrder(Order order, List<Order> orderList){
        if(orderValidator.validateForAvailability(order, orderList)){
            orderStorage.addOrder(order, orderList);
        }
        else {
            throw new UnsupportedOperationException("Error in validation");
        }
    }

    public List<Order> loadAllByUserId(Long userId, List<Order> orderList){
        return orderStorage.findOrderByUserId(userId, orderList);
    }

}