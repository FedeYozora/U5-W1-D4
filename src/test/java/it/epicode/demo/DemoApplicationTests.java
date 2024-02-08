package it.epicode.demo;

import it.epicode.demo.entities.OrderItem;
import it.epicode.demo.entities.Pizzas;
import it.epicode.demo.entities.Table;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private ApplicationContext context;

	@AfterAll
	public static void afterEach(){
		System.out.println("Next Test");
	}
	@Test
	@Disabled
	void testMessage() {
		String exp = "Hello!";
		String act = "Hi!";
		assertEquals(exp,act);
	}

	@ParameterizedTest
	@ValueSource(ints = {1,2,3})
	void testNumbers(int number) {
		assertTrue(number > 0,"Number is positive");
	}

	@ParameterizedTest
	@NullSource
	void nullSource(String input) {
		assertTrue(Strings.isBlank(input));
	}

	@Test
	public void testPizzaMargheritaBean() {
		Pizzas pizza = context.getBean("pizzaMargherita", Pizzas.class);
		assertEquals("Margherita", pizza.getName());
		assertEquals("Formaggio e Pomodoro", pizza.getBaseIngredients());
		assertEquals(1104, pizza.getCalories());
		assertEquals(4.99, pizza.getPrice());
	}

	@Test
	public void testOrderTotalAmount() {
		BeansConfiguration beansConfiguration = new BeansConfiguration();
		Table table = context.getBean("table1", Table.class);
		Pizzas pizza1 = context.getBean("pizzaMargherita", Pizzas.class);
		Pizzas pizza2 = context.getBean("pizzaHawaiian", Pizzas.class);
		List<OrderItem> orderItems = Arrays.asList(
				new OrderItem(pizza1, 1),
				new OrderItem(pizza2, 1)
		);
		double totalAmount = beansConfiguration.calculateTotalAmount(orderItems, table);
		assertEquals(12.00, totalAmount);
	}
}
