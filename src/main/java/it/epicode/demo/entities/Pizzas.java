package it.epicode.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@ToString
@Entity
public class Pizzas {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Setter
    private String name;
    @Setter
    private String baseIngredients;
    @ElementCollection
    @Column(name = "toppings")
    private List<it.epicode.demo.entities.Toppings> toppings;
    @Setter
    private int calories;
    @Setter
    private double price;

    public Pizzas(String name, String baseIngredients, List<it.epicode.demo.entities.Toppings> toppings, int calories, double price) {
        this.name = name;
        this.baseIngredients = baseIngredients;
        this.toppings = toppings;
        this.calories = calories;
        this.price = price;
    }
}
