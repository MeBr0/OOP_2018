package third;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner s = new Scanner(System.in);

        Employee e1 = new Employee("Aza", 3);

        Employee e2 = new Employee("Qwe", 3);

        System.out.println(e1.compareTo(e2));

        Employee e3 = e2.clone();

        System.out.println(e2.compareTo(e3));

        ArrayList<Employee> ems = new ArrayList<Employee>();

        ems.add(e1);
        ems.add(e2);
        ems.add(e3);

        Manager m1 = new Manager("Qaz", 2, ems);
        Manager m2 = new Manager("Wsx", 4, ems);

        System.out.println(m1.compareTo(m2));

        Manager m3 = m1.clone();

        System.out.println(m1.compareTo(m3));
    }
}
