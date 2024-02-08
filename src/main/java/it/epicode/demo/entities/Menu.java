package it.epicode.demo.entities;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Menu {
    private List<Pizzas> pizzas;
    private List<Toppings> toppings;
    private List<Drinks> drinks;
}