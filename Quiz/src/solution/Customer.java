package solution;

class Customer
{
    
    private String name;
    private String address;
    private String phoneNumber;
    private String paymentMode; 
    private int mealQuantity;
    private int sweetDishQuantity;
    private double totalAmount;
    
    public Customer(String name,String address,String phoneNumber,String paymentMode)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.paymentMode = paymentMode;
    }
    
    
    public void viewMenu()
    {
        System.out.println("                     Menu Card                        ");
        System.out.println("******************************************************");
        System.out.println(" Meal of the day:  " + Food.getTodayMeal()+"   Price: " + Food.getMealPrice());
        System.out.println(" Meal of the day:  " + Food.getTodaySweetDish()+"   Price: " + Food.getSweetDishPrice());
        System.out.println("******************************************************");
        
    }
    private void viewOrder()
    {
        System.out.println("                             Order Details     ");
        System.out.println("***********************************************************************************");
        System.out.println(" Meal of the day:  " + Food.getTodayMeal()+"   Price: " + Food.getMealPrice() + "   Quantity: " + this.mealQuantity + "    Amount: " + (Food.getMealPrice()*this.mealQuantity));
        System.out.println(" Meal of the day:  " + Food.getTodaySweetDish()+"   Price: " + Food.getSweetDishPrice() + "   Quantity: " + this.sweetDishQuantity + "    Amount: " + (Food.getSweetDishPrice()*this.sweetDishQuantity));
        System.out.println(" Total Amount:  " + this.totalAmount);
        System.out.println("***********************************************************************************");
        
    }
    
    public void placeOrder(int mealQuantity, int sweetDishQuantity)
    {
        this.mealQuantity = mealQuantity;
        this.sweetDishQuantity = sweetDishQuantity;
        this.totalAmount = (Food.getMealPrice() * mealQuantity) + ( Food.getSweetDishPrice() * sweetDishQuantity);
        if ((this.paymentMode.equals("Cash") && this.totalAmount >= 500) || (this.paymentMode.equals("Card") && this.totalAmount >= 1000))
        {
            System.out.println("Order Placed Successfully");
            viewOrder();
        }
        else
        {
            System.out.println("Order can't be placed, In case of Cash payment minimum order amount is 500 and for Card payment minimum order amount is 1000");
        }
    }
    
    public void cancelOrder(  )
    {
        System.out.println("Your order is cancelled");
    }
    
}
    
