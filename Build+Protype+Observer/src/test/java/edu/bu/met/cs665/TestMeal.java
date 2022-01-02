package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import edu.bu.met.cs665.restaurant.*;

// Write some Unit tests for your program like the following.

public class TestMeal {

	public TestMeal() {
	}

	@Test
	public void testTypeMeal() {
		String kidDrink = "Sprite";
		String kidMain = "Nuggets";
		String kidDessert = "Cinnamon rolls";

		MealBuilder kmeal = Cashier.getMeal("kid");
		kmeal.buildDrink(kidDrink);
		kmeal.buildMain(kidMain);
		kmeal.buildDessert(kidDessert);
		assertEquals("kid", kmeal.getType());

	}

	@Test
	public void testSizeMeal() {
		String kidDrink = "Sprite";
		String kidMain = "Nuggets";
		String kidDessert = "Cinnamon rolls";

		MealBuilder kmeal = Cashier.getMeal("kid");
		kmeal.buildDrink(kidDrink);
		kmeal.buildMain(kidMain);
		kmeal.buildDessert(kidDessert);
		assertEquals("small", kmeal.getSize());
	}

	@Test
	public void testgetMeal() {
		String kidDrink = "Sprite";
		String kidMain = "Nuggets";
		String kidDessert = "Cinnamon rolls";

		MealBuilder kmeal = Cashier.getMeal("kid");
		kmeal.buildDrink(kidDrink);
		kmeal.buildMain(kidMain);
		kmeal.buildDessert(kidDessert);
		assertEquals("Sprite", kmeal.getMeal().getDrink());
	}

	@Test
	public void testFoodOrder() {
		String kidDrink = "Sprite";
		String kidMain = "Nuggets";
		String kidDessert = "Cinnamon rolls";

		MealBuilder kmeal = Cashier.getMeal("kid");
		kmeal.buildDrink(kidDrink);
		kmeal.buildMain(kidMain);
		kmeal.buildDessert(kidDessert);

		Order korder = new Order(kmeal);
		for (int i = 1; i < 6; i++) {
			new Driver(" Driver id :" + i + " ", korder);
		}

		assertEquals("Nuggets", korder.getFood().getMeal().getMain());
	}

	@Test
	public void testMain() {

		String[] args = { "one", "two", "three" };
		Main.main(args);
	}

}
