package Problem1;

import Problem1.Employee;
import Problem1.Manager;

public class P1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Mark";
        emp.age = 25;
        emp.phoneNumber = "0312-8574256";
        emp.address = "DHA Phase VII";
        emp.salary = 30000;
        emp.display();
        emp.printSalary();

        System.out.println();

        Manager man = new Manager();
        man.name = "Allen";
        man.age = 32;
        man.phoneNumber = "0332-8952347";
        man.address = "DHA Phase IX";
        man.salary = 60000;
        man.display();
        man.printSalary();
    }
}