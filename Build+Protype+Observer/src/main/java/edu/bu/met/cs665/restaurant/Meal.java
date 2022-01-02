package edu.bu.met.cs665.restaurant;

/*
 * Name: Karen Sommer Date: 11/010/2021 Course: CS-665 Final project Description:
 * Meal class, is the Product in builder pattern
 */
public class Meal {
	public String drink;
	public String main;
	public String dessert;
	public String size;

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getDessert() {
		return dessert;
	}

	public void setDessert(String dessert) {
		this.dessert = dessert;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String toString() {
		String tostring = ("The size meal is " + this.getSize() + "\n" + "Drink " + this.getDrink() + "\n"
				+ "Main dish " + this.getMain() + "\n" + "Dessert " + this.getDessert() + "\n");
		return tostring;
	}

}
