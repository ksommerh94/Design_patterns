package edu.bu.met.cs665.restaurant;
/*
 * Name: Karen Sommer Date: 11/010/2021 Course: CS-665 Final project Description:
 *  Abstract class MealBuilder, is the builder in build pattern
 *  Builds the drink, main dish and dessert.
 */

public abstract class MealBuilder implements Cloneable {
	protected Meal meal = new Meal();

	public abstract void buildDrink(String kidDrink);

	public abstract void buildMain(String kidMain);

	public abstract void buildDessert(String kidDessert);

	public abstract Meal getMeal();

	public abstract String getSize();

	protected String mealName;

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	public abstract String getType();

}
