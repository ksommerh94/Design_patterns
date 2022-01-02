package edu.bu.met.cs665.restaurant;

import java.util.HashMap;
import java.util.Map;

/*
 * is one of the types of meals. Is one of the ConcreteBuilder in builder pattern
 * Cashier is the class that generates/directs the meals . Is the Director in builder pattern
 */
public class Cashier {

	private static Map<String, MealBuilder> mealMap = new HashMap<String, MealBuilder>();

	static {
		mealMap.put("kid", new KidsMeal());
		mealMap.put("adult", new AdultMeal());
	}

	public static MealBuilder getMeal(String mealName) {
		return (MealBuilder) mealMap.get(mealName).clone();
	}

}
