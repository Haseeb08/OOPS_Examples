package Restaurant;

public class Main {
	public static void main(String args[]){
		Meal pizzaMeal=new Pizza();
		pizzaMeal.displayMenu();
		Meal burgerMeal=new Burger();
		burgerMeal.displayMenu();
		Drink drink=new Drink();
		drink.drinkTypes();
	    }
}
