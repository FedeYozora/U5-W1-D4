package it.epicode.demo.dao;

import it.epicode.demo.entities.Toppings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ToppingService {
    @Autowired
    private ToppingDAO toppingRepo;

    public void save(Toppings d) {
        toppingRepo.save(d);
        log.info("Topping Salvato Correttamente");
    }
}
