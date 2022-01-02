package edu.bu.met.cs665;

import edu.bu.met.cs665.restaurant.*;

public class Main {

	/**
	 * Name: Karen Sommer Date: 11/010/2021 Course: CS-665 Final project
	 * A main method to run examples.
	 *
	 * @param args not used
	 */
	public static void main(String[] args) {
		/*
		 * Based on this sources:
		 * https://www.geeksforgeeks.org/prototype-design-pattern/
		 * https://dzone.com/articles/design-patterns-builder
		 * https://sourcemaking.com/design_patterns/builder/java/2
		 * https://sourcemaking.com/design_patterns/builder
		 * 
		 */

		// Create Meal
		String kidDrink = "Sprite";
		String kidMain = "Nuggets";
		String kidDessert = "Cinnamon rolls";

		MealBuilder kmeal = Cashier.getMeal("kid");
		kmeal.buildDrink(kidDrink);
		kmeal.buildMain(kidMain);
		kmeal.buildDessert(kidDessert);
		Meal meal = kmeal.getMeal();
		System.out.print(kmeal.getType() + "    " + meal.toString());

		// Create 5 Drivers instances that are going to receive the notification of the
		// food.
		Order korder = new Order(kmeal);
		for (int i = 1; i < 6; i++) {
			new Driver(" Driver id :" + i + " ", korder);
		}
		// Drivers know there is a new food pickup!
		korder.setLatestDeliveryUpdate("New order is set for delivery");

		// Create Meal
		String adultDrink = "Beer";
		String adultMain = "Jack Daniels burger";
		String adultDessert = "Churros";

		MealBuilder ameal = Cashier.getMeal("adult");
		ameal.buildDrink(adultDrink);
		ameal.buildMain(adultMain);
		ameal.buildDessert(adultDessert);
		Meal meals = ameal.getMeal();
		System.out.print(ameal.getType() + "    " + meals.toString());

		// Create 5 Drivers instances that are going to receive the notification of the
		// food.
		Order aorder = new Order(ameal);
		for (int i = 1; i < 6; i++) {
			new Driver(" Driver id :" + i + " ", aorder);
		}
		// Drivers know there is a new food pickup!
		aorder.setLatestDeliveryUpdate("New order is set for delivery!!");

	}

}
