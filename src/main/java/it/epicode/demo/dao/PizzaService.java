package it.epicode.demo.dao;

import it.epicode.demo.entities.Pizzas;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PizzaService {
    @Autowired
    private PizzaDAO pizzaRepo;

    public void save(Pizzas d) {
        pizzaRepo.save(d);
        log.info("Pizza Salvata Correttamente");
    }
    public void displaySavedPizzas() {
        List<Pizzas> pizzas = pizzaRepo.findAll();
        pizzas.forEach(pizza -> System.out.println(pizza.getName()));
    }
}
