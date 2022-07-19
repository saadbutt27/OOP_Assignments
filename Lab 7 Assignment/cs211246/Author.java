public class Author {
    static String publisherName;
    String name;
    String email;
    String gender;
    String books[];

    Author(String name, String email, String gender, String[] books) {
       this.name = name;
       this.email = email;
       this.gender = gender;
       this.books = books;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        for (int i=0; i<books.length; i++) {
            System.out.println("Book: " + books[i]);
        }
        System.out.println();
    }

    static void displayAuthor() {
        System.out.println("Publisher: " + publisherName); // static method can only have static variables
    }
}
