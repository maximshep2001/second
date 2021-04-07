package by.issoft.sample.persistence;

import by.issoft.sample.domain.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class OrderStorage {

    public void addOrder(Order order, List<Order> orderList){
        orderList.add(order);
    }

    public List<Order> findOrderByUserId(Long userId, List<Order> orderList){
        List<Order> resultList = null;
        for (Order orderInList : orderList) {
            if(orderInList.getUserId().equals(userId)){
                resultList = new ArrayList<>();
                resultList.add(orderInList);
            }
        }
        return resultList;
    }

    public List<Order> findOrder(Order order, List<Order> orderList){
        List<Order> resultList = null;
        for (Order orderInList : orderList) {
            if(orderInList.equals(order)){
                resultList = new ArrayList<>();
                resultList.add(orderInList);
            }
        }
        return resultList;
    }

    public Optional<Order> findByOrderId(String orderNumber) {
        return Optional.empty();
    }

    public String persist(Order order) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public Order load(String number) {
        throw new UnsupportedOperationException("not implemented yet");
    }
}