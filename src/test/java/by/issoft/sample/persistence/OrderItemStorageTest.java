package by.issoft.sample.persistence;

import by.issoft.sample.domain.OrderItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderItemStorageTest {

    private OrderItemStorage orderItemStorage = new OrderItemStorage();

    @Test
    void findByOrderNumber() {
        orderItemStorage.findByOrderNumber("12");
    }

    @Test
    void persist() {
        orderItemStorage.persist(new OrderItem());
    }

    @Test
    void loadGreen() {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            orderItemStorage.load("111");
        });
    }

    @Test
    void loadRed() {
        orderItemStorage.load("111");
    }


}