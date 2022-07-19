package cs211246.Problem02;

public class P2 {
    public static void main(String[] args) {

        System.out.println("************************************");

        Engine engineObj = new Engine("FT-109");

        Car carObj1 = new Car(2022, "Sonata", 79999.00f, "Black Diamond Metallic", engineObj);
        carObj1.displayInfo();
        System.out.println("Engine's Model No. " + engineObj.getModelNumber());
        carObj1.start();
        carObj1.stop();

        System.out.println("************************************");
    }
}
