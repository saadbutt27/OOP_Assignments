import static java.lang.Math.pow;

public class Shapes {
    void area (float length, float bredth) {
        System.out.println("Area of Rectangle = " + length * bredth);
    }

    void area (float side) {
        System.out.println("Area of Square = " + pow(side,2));
    }
}
