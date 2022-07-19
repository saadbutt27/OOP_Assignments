import java.util.ArrayList;
import java.util.List;

public class P1 {
    public static void main(String[] args) {

        Author.publisherName = "Floyd and Sons";

        Author obj1 = new Author("Saad", "saad123@email.com", "Male", new String[] {"OOP","DLD"});
        Author obj2 = new Author("Usman", "usman123@email.com", "Male", new String[] {"OOP","DSA"});

        obj1.displayInfo();
        obj2.displayInfo();

        Author.displayAuthor();
        
    }
}