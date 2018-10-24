package second;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Sphere s1 = new Sphere(s.nextDouble(), "Black", true);

        System.out.println(s1);

        Textbook t1 = new Textbook("Azaza", s.nextDouble());

        System.out.println("Price with discount is " + t1.getValue());
        System.out.println("Value of return sum is " + t1.getCharge());

    }
}
