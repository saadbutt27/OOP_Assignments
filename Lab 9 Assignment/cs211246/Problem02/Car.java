package cs211246.Problem02;

public class Car {
    private int year;
    private String model;
    private float price;
    private String color;
    private Engine engine;

    public Car(){
        year = 0000;
        model = "---";
        price = 0.0f;
        color = "###";
    }
    public Car(int year, String model, float price, String color, Engine engine) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color;
        this.engine = engine;
    }
    public void displayInfo() {
        System.out.println("-----------" +
                            "\nCar's Info." +
                            "\n-----------" +
                            "\nCar's year of release: " + year +
                            "\nCar's model: " + model +
                            "\nCar's price: " + price +
                            "\nCar's color: " + color);
    }
    public void start() {
        System.out.print("Car starts when ");
        engine.start();
    }
    public void stop() {
        System.out.print("Car stops when ");
        engine.stop();
    }
}
