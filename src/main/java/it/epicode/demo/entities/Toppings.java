package it.epicode.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Entity
public class Toppings {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Setter
    private String name;
    @Setter
    private int calories;
    @Setter
    private double price;

    public Toppings(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
}
