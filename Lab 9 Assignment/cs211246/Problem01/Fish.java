package cs211246.Problem01;

public class Fish implements Animal{
    @Override
    public void eat() {
        System.out.println("Fish eats");
    }

    @Override
    public void travel() {
        System.out.println("Fishes travel in water");
    }
}
