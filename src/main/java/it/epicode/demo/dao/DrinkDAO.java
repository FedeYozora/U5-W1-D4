package it.epicode.demo.dao;

import it.epicode.demo.entities.Drinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrinkDAO extends JpaRepository<Drinks,Long> {
    @Query("SELECT d FROM Drinks d ORDER BY d.price ASC")
    Drinks findDrinkWithLowestPrice();
}
