package cs211246;

import java.util.Scanner;

public class Order {
    private String name;
    private String address;
    private String phoneNo;
    private String paymentMode;
    protected String item;
    private int quantityOfItem;
    private int totalBill;
    int orderId = 0;

    protected void viewOrder(){
        System.out.println("**** Your Order ****");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNo);
        System.out.println("Payment Method: " + paymentMode);
        System.out.println("Items Ordered: " + item);
        System.out.println("Quantity of items: " + quantityOfItem);
        System.out.println("Total Bill: " + totalBill);
    }
    protected void placeOrder(int i){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.name = input.nextLine();
        System.out.print("Enter your address: ");
        this.address = input.nextLine();
        System.out.print("Enter your phone number: ");
        this.phoneNo = input.nextLine();
        System.out.print("Enter payment method: ");
        this.paymentMode = input.nextLine();
        System.out.print("Enter item: ");
        this.item = input.nextLine();
        System.out.print("Enter quantity of item: ");
        this.quantityOfItem = input.nextInt();
        orderId = i;
        System.out.println("Your order id is " + orderId);
    }

    protected boolean checkEligibility(String meal, int priceMeal, String sweet, int priceSweet) {
        if (item.compareToIgnoreCase(meal) == 0) {
            totalBill = quantityOfItem * priceMeal;
            if (paymentMode.compareToIgnoreCase("cash") == 0 && totalBill < 500) {
                return false;
            }
            else if (paymentMode.compareToIgnoreCase("card") == 0 && totalBill < 1000) {
                return false;
            }
        }
        else if (item.compareToIgnoreCase(sweet) == 0) {
            totalBill = quantityOfItem * priceSweet;
            if (paymentMode.compareToIgnoreCase("cash") == 0 && totalBill < 500) {
                return false;
            }
            else if (paymentMode.compareToIgnoreCase("card") == 0 && totalBill < 1000) {
                return false;
            }
        }
        return true;
    }
    static void cancelOrder(Order orders[], int orderId){
        for(int i=0; i<10; i++) {
            if (orders[i] == null) {
                break;
            }
            if (orders[i].orderId == orderId) {
                for(int j=1; j<10; j++) {
                    if(orders[j] == null){
                        break;
                    }
                    orders[j] = orders[j+1];
                }
                break;
            }
        }
    }
}
