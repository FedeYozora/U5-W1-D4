package it.epicode.demo.dao;

import it.epicode.demo.entities.Pizzas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PizzaDAO extends JpaRepository<Pizzas, Long> {
    @Query("SELECT p FROM Pizzas p JOIN p.toppings t WHERE t.name = :toppingName")
    List<Pizzas> findPizzasByTopping(String toppingName);

    @Query("SELECT p FROM Pizzas p WHERE p.price BETWEEN :minPrice AND :maxPrice")
    List<Pizzas> findPizzasByPriceRange(@Param("minPrice") Double minPrice, @Param("maxPrice") Double maxPrice);
}
