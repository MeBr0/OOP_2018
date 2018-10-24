package fourth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Runner r1 = new Runner(8.4);

        System.out.println(r1.isMoving());
        System.out.println(r1.isRunning());
        System.out.println(r1.getVelocity());

        Runner r2 = new Runner(4);

        System.out.println(r2.isMoving());
        System.out.println(r2.isRunning());
        System.out.println(r2.getVelocity());
    }
}
