public class BankAccount {
    String accountNumber;
    String accountHoldersName;
    int balance;

    BankAccount() {
        accountNumber = null;
        accountHoldersName = null;
        balance = 0;
    }

    void infoSetter (String accNum, String holderName, int bal) {
        accountNumber = accNum;
        accountHoldersName = holderName;
        balance = bal;
    }

    void creditBalance (int amount) {
        balance += amount;
    }

    void displayInfo () {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder's Name: " + accountHoldersName);
        System.out.println("Balance amount: " + balance);
    }
}
