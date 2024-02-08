package it.epicode.demo.dao;

import it.epicode.demo.entities.Pizzas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PizzaDAO extends JpaRepository<Pizzas, Long> {
}
