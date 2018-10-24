package Functions;

import java.util.Scanner;

public class min{
    private static int min(int a, int b, int c, int d){
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        System.out.print(min(a, b, c, d));



    }
}
