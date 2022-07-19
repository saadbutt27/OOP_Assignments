package Problem1;

public class Member {
    public String name;
    public int age;
    public String phoneNumber;
    public String address;
    public int salary;

    public void printSalary() {
        System.out.println(salary);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.print("Salary: ");
    }
}
