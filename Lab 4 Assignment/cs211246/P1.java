import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {

        String accountNumber;
        String accountHoldersName;
        int balance;
        int creditAmount;

        Scanner input = new Scanner(System.in);

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        System.out.print("Enter Account number: ");
        accountNumber = input.nextLine();
        System.out.print("Enter your name: ");
        accountHoldersName = input.nextLine();
        System.out.print("Enter balance amount: ");
        balance = input.nextInt();
        input.nextLine();
        account1.infoSetter(accountNumber, accountHoldersName, balance);
        System.out.println("Account no. 1");
        account1.displayInfo();

        System.out.print("Enter Account number: ");
        accountNumber = input.nextLine();
        System.out.print("Enter your name: ");
        accountHoldersName = input.nextLine();
        System.out.print("Enter balance amount: ");
        balance = input.nextInt();
        input.nextLine();
        account2.infoSetter(accountNumber, accountHoldersName, balance);
        System.out.println("Account no. 2");
        account2.displayInfo();

        System.out.print("Enter Account number: ");
        accountNumber = input.nextLine();
        System.out.print("Enter your name: ");
        accountHoldersName = input.nextLine();
        System.out.print("Enter balance amount: ");
        balance = input.nextInt();
        input.nextLine();
        account3.infoSetter(accountNumber, accountHoldersName, balance);
        System.out.println("Account no. 3");
        account3.displayInfo();

        System.out.print("Enter amount to credit in account 1: ");
        creditAmount = input.nextInt();
        account1.creditBalance(creditAmount);
        System.out.println("Account no. 1");
        account1.displayInfo();

        System.out.print("Enter amount to credit in account 2: ");
        creditAmount = input.nextInt();
        account2.creditBalance(creditAmount);
        System.out.println("Account no. 2");
        account2.displayInfo();

        System.out.print("Enter amount to credit in account 3: ");
        creditAmount = input.nextInt();
        account3.creditBalance(creditAmount);
        System.out.println("Account no. 3");
        account3.displayInfo();
    }
}