//Problem Statement : Build a restaurant that serves Pizza,
//Burger which implements a meal class. Soft drinks that implement bottle class

abstract class Meal{
    abstract void displayMenu();
}
class Pizza extends Meal{

    @Override
    public void displayMenu() {
        System.out.println("Pizza");

            System.out.println("**VEG**\nJalpeno\nPaneer\nBaby corn");

            System.out.println("**NON-VEG\nChicken Peri peri\nChicken Tikka\nChicken Barbeque");
    }
}
class Burger extends Meal{   
    void displayMenu() {
        System.out.println("BURGER");
            System.out.println("\nPaneer tikki\nAloo Tikki\nChicken Patti\nMaharaja");
            

    }
}
interface Bottle{
     void drinkTypes();
}
class Drink implements Bottle{
    @Override
    public void drinkTypes() {
        System.out.println("**Drinks**\nCoke\nSprite\nMazza\n");
    }
}
public class Restaurant {
	 
    public static void main(String args[]){
	Meal pizzaMeal=new Pizza();
	pizzaMeal.displayMenu();
	Meal burgerMeal=new Burger();
	burgerMeal.displayMenu();
	Drink drink=new Drink();
	drink.drinkTypes(); 
    }
}
