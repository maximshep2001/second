package by.issoft.sample.domain;

public enum OrderStatus {
    INITIAL("Инициализирован"),
    ACTIVE("Активный"),
    DELETED("Удален");

    private String status;
    OrderStatus(String status){
        this.status = status;
    }
}