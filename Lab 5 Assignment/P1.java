import myPack.Time;

public class P1 {
    public static void main(String[] args) {
        Time myTime = new Time(0, 0 , 0);
        
        myTime.setTime(12, 15, 8);

        myTime.print();
    }
}
