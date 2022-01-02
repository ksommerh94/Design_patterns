package edu.bu.met.cs665.restaurant;
/*
 * Name: Karen Sommer Date: 11/010/2021 Course: CS-665 Final project Description:
 * AdultMeal is one of the types of meals. Is one of the ConcreteBuilder in builder pattern
 */

public class AdultMeal extends MealBuilder {
	public AdultMeal() {
		this.mealName = "adult";
		meal.setSize("large");
	}

	public void buildDrink(String drink) {
		meal.setDrink(drink);
	}

	public void buildMain(String main) {
		meal.setMain(main);
	}

	public void buildDessert(String dessert) {
		meal.setDessert(dessert);
	}

	public Meal getMeal() {
		return meal;
	}

	public String getType() {
		return this.mealName;
	}

	public String getSize() {
		return this.meal.getSize();
	}
}