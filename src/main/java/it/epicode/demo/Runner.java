package it.epicode.demo;

import it.epicode.demo.dao.*;
import it.epicode.demo.entities.Drinks;
import it.epicode.demo.entities.Pizzas;
import it.epicode.demo.entities.Toppings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Runner implements CommandLineRunner {
    @Autowired
    DrinkService drinkService;
    @Autowired
    PizzaService pizzaService;
    @Autowired
    ToppingService toppingService;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoApplication.class);
        Drinks lemonade = (Drinks) ctx.getBean("lemonade");
        Drinks water = (Drinks) ctx.getBean("water");
        Drinks wine = (Drinks) ctx.getBean("wine");
        Pizzas pizzaMargherita = (Pizzas) ctx.getBean("pizzaMargherita");
        Pizzas pizzaHawaiian = (Pizzas) ctx.getBean("pizzaHawaiian");
        Pizzas pizzaSalami = (Pizzas) ctx.getBean("pizzaSalami");
        Toppings ham = (Toppings) ctx.getBean("Ham");
        Toppings cheese = (Toppings) ctx.getBean("Cheese");
        Toppings tomato = (Toppings) ctx.getBean("Tomato");
        Toppings onions = (Toppings) ctx.getBean("Onions");
        Toppings pineapple = (Toppings) ctx.getBean("Pineapple");
        Toppings salami = (Toppings) ctx.getBean("Salami");
        System.out.println("--------------------------------------------- SAVE -----------------------------------------");
        drinkService.save(lemonade);
        drinkService.save(water);
        drinkService.save(wine);
        toppingService.save(ham);
        toppingService.save(cheese);
        toppingService.save(tomato);
        toppingService.save(onions);
        toppingService.save(pineapple);
        toppingService.save(salami);
        pizzaService.save(pizzaMargherita);
        pizzaService.save(pizzaHawaiian);
        pizzaService.save(pizzaSalami);
        System.out.println("--------------------------------------------- FIND BY QUERIES -----------------------------------------");
//        System.out.println("Drink con il prezzo piú basso: " + DrinkDAO.findDrinkWithLowestPrice().getName());
//        System.out.println("Pizze con formaggio: " + PizzaDAO.findPizzasByTopping("Cheese"));
//        System.out.println("Topping con le calorie piú alte: " + ToppingDAO.findToppingWithHighestCalories().getName());
//        System.out.println("Pizze con un prezzo tra 5 e 10: " + PizzaDAO.findPizzasByPriceRange(5D, 10D));
    }
}
