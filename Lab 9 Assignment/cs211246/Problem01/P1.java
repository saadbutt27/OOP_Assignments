package cs211246.Problem01;

public class P1 {
    public static void main(String[] args) {
        Reptiles obj1 = new Reptiles();
        obj1.eat();
        obj1.travel();
        System.out.println();

        Birds obj2 = new Birds();
        obj2.eat();
        obj2.travel();
        System.out.println();

        Fish obj3 = new Fish();
        obj3.eat();
        obj3.travel();
        System.out.println();
    }
}
