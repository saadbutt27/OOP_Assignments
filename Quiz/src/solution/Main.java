package solution;

public class Main
{
	public static void main(String[] args) {
	   	
		Food.setTodayMeal("Espetada");
		Food.setTodaySweetDish("Chocolate Brownie");
		Food.setMealPrice(700.0);
		Food.setSweetDishPrice(250.0);
		
		Customer c1 = new Customer("Sara", "House No A-250","0333-1111111","Card");
		c1.viewMenu();
		c1.placeOrder(2,1);
		c1.cancelOrder();
}
}
