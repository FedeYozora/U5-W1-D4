package it.epicode.demo.dao;

import it.epicode.demo.entities.Drinks;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DrinkService {
    @Autowired
    private DrinkDAO drinkRepo;

    public void save(Drinks d) {
        drinkRepo.save(d);
        log.info("Drink Salvato Correttamente");
    }
}
