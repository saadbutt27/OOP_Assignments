import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        String alphabet = input.nextLine();

        if (alphabet.compareTo("A") < 0 || alphabet.length() > 1) {
            System.out.println("Error in input");
        } else if (alphabet.equalsIgnoreCase("A") || alphabet.equalsIgnoreCase("E") || alphabet.equalsIgnoreCase("I") || alphabet.equalsIgnoreCase("O") || alphabet.equalsIgnoreCase("U")) {
            System.out.println(alphabet + " is a Vowel");
        } else {
            System.out.println(alphabet + " is a Consonanat");
        }
    }
}