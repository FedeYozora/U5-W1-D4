package it.epicode.demo.dao;

import it.epicode.demo.entities.Toppings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ToppingDAO extends JpaRepository<Toppings, Long> {
}
