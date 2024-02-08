package it.epicode.demo.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class OrderItem {
    private Pizzas menuItem;
    private int quantity;
}