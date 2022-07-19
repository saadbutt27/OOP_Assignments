package cs211246.Problem01;

public class Birds implements Animal{
    @Override
    public void eat() {
        System.out.println("Birds eat");
    }

    @Override
    public void travel() {
        System.out.println("Birds travel by flying");
    }
}
