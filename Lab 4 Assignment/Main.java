import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String accountNumber;
        String accountHoldersName;
        int balance;
        int creditAmount;

        Scanner input = new Scanner(System.in);

        BankAccount[] account = new BankAccount[3];

        for (int i=0; i<3; i++) {
            account[i] = new BankAccount();
            System.out.print("Enter Account number: ");
            accountNumber = input.nextLine();
            System.out.print("Enter your name: ");
            accountHoldersName = input.nextLine();
            System.out.print("Enter balance amount: ");
            balance = input.nextInt();
            input.nextLine();
            account[i].infoSetter(accountNumber, accountHoldersName, balance);
            System.out.print("Account no. ");
            System.out.println(i+1);
            account[i].displayInfo();
        }

        for (int i=0; i<3; i++) {
            System.out.print("Enter amount to credit in account: ");
            creditAmount = input.nextInt();
            account[i].creditBalance(creditAmount);
            System.out.print("Account no. ");
            System.out.println(i+1);
            account[i].displayInfo();
        }
    }
}