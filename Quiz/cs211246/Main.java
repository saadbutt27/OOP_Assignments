package cs211246;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HomeChef items = new HomeChef("Biryani", 100, "Custard", 150);
        Order orders[] = new Order[10];

        int select = 0;
        int select2 = 0;
        int orderIndex = 0;
        int orderId = 0;
        System.out.println("**********************************");
        System.out.println("Welcome to Ordering Homemade Food");
        System.out.println("**********************************");
        while(select < 3) {
            System.out.println("**************");
            System.out.println("1: Home Chef");
            System.out.println("2: Customer");
            System.out.println("3: Exit");
            System.out.println("**************");
            System.out.print("Select from above choices: ");
            select = input.nextInt();
            switch (select) {
                case 1 : { // Home Chef's Section to update menu
                    System.out.println("**** Update Menu ****");
                    items.updateMenu();
                    break;
                }
                case 2 : { // Customer's section
                    System.out.println("1: Place Order");
                    System.out.println("2: View Order");
                    System.out.println("3: Cancel Order");
                    System.out.print("Enter: ");
                    select2 = input.nextInt();
                    switch (select2) {
                        case 1: { // Place order after being eligible
                            orders[orderIndex] = new Order();
                            items.menu();
                            orders[orderIndex].placeOrder(orderIndex+1);
                            if (!orders[orderIndex].checkEligibility(items.meal, items.priceOfMeal, items.sweetDish, items.priceOfSweetDish)) {
                                orders[orderIndex].cancelOrder(orders, orderId);
                                orderIndex--;
                                System.out.println("\n** Order can't be place **");
                            }
                            orderIndex++;
                            break;
                        }
                        case 2: { // View order by entering order id
                            System.out.print("Enter your order ID: ");
                            orderId = input.nextInt();
                            for (int i=0; i<10; i++) {
                                if (orders[i].orderId == orderId) {
                                    orders[i].viewOrder();
                                    break;
                                }
                            }
                            break;
                        }
                        case 3: { // Cancel order if customer wants
                            System.out.print("Enter your Order Id: ");
                            orderId = input.nextInt();
                            Order.cancelOrder(orders, orderId);
                            System.out.println("\n*** Order Canceled ***");
                            break;
                        }
                    }
                    break;
                }

                case 3 : { // Exit the program with thank you message
                    System.out.println("\n ** Thank you for being here **");
                    System.exit(0);
                }
            }
        }
    }
}