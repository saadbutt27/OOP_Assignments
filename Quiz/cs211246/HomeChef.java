package cs211246;

import java.util.Scanner;

public class HomeChef {
    protected String meal;
    protected int priceOfMeal;
    protected String sweetDish;
    protected int priceOfSweetDish;

    HomeChef(String meal, int priceOfMeal, String sweetDish, int priceOfSweetDish){
        this.meal = meal;
        this.priceOfMeal = priceOfMeal;
        this.sweetDish = sweetDish;
        this.priceOfSweetDish = priceOfSweetDish;
    }

    public void menu() {
        System.out.println("**** Today's Menu ****");
        System.out.println("Meal of the day: " + meal);
        System.out.println("Price meal of the day: " + priceOfMeal);
        System.out.println("Sweet dish of the day: " + sweetDish);
        System.out.println("Price of sweet dish of the day: " + priceOfMeal);
    }

    protected void updateMenu(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter meal of the day: ");
        meal = input.nextLine();
        System.out.print("Enter price meal of the day: ");
        priceOfMeal = input.nextInt();
        input.nextLine();
        System.out.print("Enter sweet dish of the day: ");
        sweetDish = input.nextLine();
        System.out.print("Enter price of sweet dish of the day: ");
        priceOfSweetDish = input.nextInt();
    }

}
