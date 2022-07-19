public class P2 {

    public static void main(String[] args) {
        // Problem 2
        System.out.println("******************************");
        System.out.println("Problem no. 2");
        BankA obj1 = new BankA();
        obj1.depositAmount(1000);
        System.out.print("Balance amount in Bank A: $");
        System.out.println(obj1.getBalance());
        BankB obj2 = new BankB();
        obj2.depositAmount(1500);
        System.out.print("Balance amount in Bank B: $");
        System.out.println(obj2.getBalance());
        BankC obj3 = new BankC();
        obj3.depositAmount(2000);
        System.out.print("Balance amount in Bank C: $");
        System.out.println(obj3.getBalance());
        System.out.println("******************************");
    }
}
