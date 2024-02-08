package it.epicode.demo.entities;

import lombok.*;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@PropertySource("application.properties")
public class Order {
    private int orderNumber;
    private State state;
    private int covers;
    private LocalDateTime acquisitionTime;
    private Table table;
    private double totalAmount;
    private List<OrderItem> orderItems;

    public enum State {
        IN_PROGRESS,
        READY,
        SERVED
    }
}