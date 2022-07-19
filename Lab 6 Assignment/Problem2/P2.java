package Problem2;

public class P2 {
    public static void main(String[] args) {
        Rectangle recObj = new Rectangle(2, 3);
        System.out.println("Rectangle");
        recObj.area();
        recObj.perimeter();

        Square sqObj = new Square(3);
        System.out.println("Square");
        sqObj.area();
        sqObj.perimeter();
    }
}
