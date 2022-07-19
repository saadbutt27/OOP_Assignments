package solution;

class Food
{
    private static String todayMeal;
    private static String todaySweetDish;
    private static double mealPrice;
    private static double sweetDishPrice;
    
    public static String getTodayMeal() {
        return todayMeal;
    }
    
    public static String getTodaySweetDish() {
        return todaySweetDish;
    }
    
    public static double getMealPrice() {
        return mealPrice;
    }
    public static double getSweetDishPrice() {
        return sweetDishPrice;
    }
    
    public static void setTodayMeal(String meal) {
        Food.todayMeal = meal;
    }
    
    public static void setTodaySweetDish(String sweetDish) {
        Food.todaySweetDish = sweetDish;
    }
    
    public static void setMealPrice(double mealPrice ) {
        Food.mealPrice = mealPrice;
    }
    
    public static void setSweetDishPrice(double sweetDishPrice) {
        Food.sweetDishPrice  = sweetDishPrice;
    }

}