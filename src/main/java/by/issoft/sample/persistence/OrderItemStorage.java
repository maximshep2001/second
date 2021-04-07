package by.issoft.sample.persistence;

import by.issoft.sample.domain.Order;
import by.issoft.sample.domain.OrderItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderItemStorage {

    public static List<OrderItem> orderItemList = new ArrayList<>();

    public void addOrderItem(OrderItem orderItem){
        orderItemList.add(orderItem);
    }

    public Optional<OrderItem> findByOrderNumber(String orderNumber) {
        return Optional.empty();
    }

    public String persist(OrderItem orderItem) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public OrderItem load(String number) { throw new UnsupportedOperationException("not implemented yet"); }


}