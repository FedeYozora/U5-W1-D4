package it.epicode.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@ToString
@Entity
public class Drinks {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Setter
    private String name;
    @Setter
    private int calories;
    @Setter
    private double price;

    public Drinks(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
}
