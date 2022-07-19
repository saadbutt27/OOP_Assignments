package Problem2;

public class Rectangle {

    protected int length;
    protected int bredth;

    Rectangle(int l, int b) {
        length = l;
        bredth = b;
    }
    public Rectangle() {

    }

    public void area() {
        if (length == bredth) {
            System.out.print("Area of Square = ");
            System.out.println(length * bredth);
        } else {
            System.out.print("Area of Rectangle = ");
            System.out.println(length * bredth);
        }
    }

    public void perimeter() {
        if (length == bredth) {
            System.out.print("Perimeter of Square = ");
            System.out.println(4 * length);

        } else {
            System.out.print("Perimeter of Rectangle = ");
            System.out.println(2 * (length + bredth));
        }
    }
}
