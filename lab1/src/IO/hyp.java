package IO;

import java.util.Scanner;

public class hyp{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        double c = Math.sqrt( a * a  + b * b);

        System.out.println(c);
    }
}
