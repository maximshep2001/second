package by.issoft.sample.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Order implements Serializable {

    private Long orderId;
    private Long userId;
    private OrderStatus status;
    private List<OrderItem> orderItem;
    private String address;


    public Order(Long orderId, OrderStatus status, List<OrderItem> orderItem, String address) {
        this.orderId = orderId;
        this.status = status;
        this.orderItem = orderItem;
        this.address = address;
    }

    public Order(Long userId) {
        this.userId = userId;
    }

    public Order() {
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setOrderItem(List<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderId, order.orderId) &&
                status == order.status &&
                Objects.equals(orderItem, order.orderItem) &&
                Objects.equals(address, order.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, status, orderItem, address);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", status=" + status +
                ", orderItem=" + orderItem +
                ", address='" + address + '\'' +
                '}';
    }
}
