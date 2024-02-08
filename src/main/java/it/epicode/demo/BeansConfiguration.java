package it.epicode.demo;

import it.epicode.demo.entities.*;
import it.epicode.demo.entities.Toppings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class BeansConfiguration {
    String baseIngredients = "Formaggio e Pomodoro";
    @Value("${cost-cover}")
    double costCover;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    private double getCostCover() {
        return costCover;
    }

    @Bean
    Pizzas pizzaMargherita() {
        List<Toppings> toppings = Arrays.asList();
        return new Pizzas("Margherita", baseIngredients, toppings, 1104, 4.99);
    }

    @Bean
    Pizzas pizzaHawaiian() {
        List<Toppings> HawaiianToppings = Arrays.asList(Ham(), Pineapple());
        return new Pizzas("Hawaiian", baseIngredients, HawaiianToppings, 1024, 6.49);
    }

    @Bean
    Pizzas pizzaSalami() {
        List<Toppings> SalamiToppings = Arrays.asList(Salami());
        return new Pizzas("Salami", baseIngredients, SalamiToppings, 1160, 5.99);
    }

//    @Bean
//    public List<Pizzas> allPizzas(List<Toppings> allToppings) {
//        return Arrays.asList(pizzaMargherita(), pizzaSalami(), pizzaHawaiian());
//    }

    @Bean
    public Drinks lemonade() {
        return new Drinks("Limonata", 128, 1.29);
    }

    @Bean
    public Drinks water() {
        return new Drinks("Acqua", 0, 1.29);
    }

    @Bean
    public Drinks wine() {
        return new Drinks("Vino", 607, 7.49);
    }

    @Bean
    public List<Drinks> allDrinks() {
        return Arrays.asList(lemonade(), water(), wine());
    }

    @Bean
    Toppings Ham() {
        return new Toppings("Prosciutto", 35, 0.99);
    }

    @Bean
    public Toppings Cheese() {
        return new Toppings("Formaggio", 92, 0.69);
    }

    @Bean
    public Toppings Tomato() {
        return new Toppings("Pomodoro", 50, 0.99);
    }

    @Bean
    public Toppings Onions() {
        return new Toppings("Cipolla", 22, 0.69);
    }

    @Bean
    public Toppings Pineapple() {
        return new Toppings("Ananas", 24, 0.79);
    }

    @Bean
    public Toppings Salami() {
        return new Toppings("Salame", 86, 0.99);
    }
//
//    @Bean
//    public List<Toppings> allToppings() {
//        return Arrays.asList(Cheese(), Tomato(), Ham(), Onions(), Pineapple(), Salami());
//    }
//
//    @Bean
//    public Menu menuCompleto(List<Pizzas> pizzas, List<Drinks> drinks, List<Toppings> toppings) {
//        return new Menu(pizzas, toppings, drinks);
//    }
//
//    @Bean
//    public Table table1() {
//        return new Table(4, Table.State.FREE);
//    }
//
//    @Bean
//    public Order order1(Table table) {
//        List<OrderItem> orderItems = Arrays.asList(
//                new OrderItem(pizzaMargherita(), 1),
//                new OrderItem(pizzaHawaiian(), 1)
//        );
//        return new Order(1, Order.State.IN_PROGRESS, table.getMaxCovers(), LocalDateTime.now(), table, calculateTotalAmount(orderItems, table), orderItems);
//    }
//
//    double calculateTotalAmount(List<OrderItem> orderItems, Table table) {
//        double totalAmount = 0;
//        for (OrderItem orderItem : orderItems) {
//            totalAmount += orderItem.getMenuItem().getPrice() * orderItem.getQuantity();
//        }
//        totalAmount += getCostCover() * table.getMaxCovers();
//        return totalAmount;
//    }
}
