package cs211246.Problem01;

public class Reptiles implements Animal{
    @Override
    public void eat() {
        System.out.println("Reptiles eat");
    }

    @Override
    public void travel() {
        System.out.println("Reptiles travel");
    }
}
