public class BankA extends Bank{

    void depositAmount (int b) {
        balance += b;
    }

    public int getBalance() {
        return balance;
    }
}
