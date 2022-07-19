package cs211246.Problem02;

public class Engine {
    private String modelNumber;

    public Engine(){
        modelNumber = "***";
    }
    public Engine(String modelNumber) {
        this.modelNumber = modelNumber;
    }
    String getModelNumber() {
        return modelNumber;
    }
    public void start() {
        System.out.println("Engine starts");
    }
    public  void stop() {
        System.out.println("Engine stops");
    }
}
