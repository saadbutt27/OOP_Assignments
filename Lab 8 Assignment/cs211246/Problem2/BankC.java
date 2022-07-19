public class BankC extends Bank{

    void depositAmount (int b) {
        balance += b;
    }

    public int getBalance() {
        return balance;
    }
}
