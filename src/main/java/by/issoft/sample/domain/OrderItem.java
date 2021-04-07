package by.issoft.sample.domain;

import java.io.Serializable;
import java.util.Objects;

public class OrderItem implements Serializable {

    private String name;
    private int amount;
    private double price;

    public OrderItem(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public OrderItem() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return amount == orderItem.amount &&
                Double.compare(orderItem.price, price) == 0 &&
                Objects.equals(name, orderItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount, price);
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
