package first;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Point p = new Point(s.nextDouble(), s.nextDouble());

        System.out.println(p);

        Cube c = new Cube(s.nextDouble());

        System.out.println(c);

        Sphere sp = new Sphere(s.nextDouble());

        System.out.println(sp);

        Cylinder cy = new Cylinder(s.nextDouble(), s.nextDouble());

        System.out.println(cy);
    }
}
