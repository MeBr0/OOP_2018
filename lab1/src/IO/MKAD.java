package IO;

import java.util.Scanner;

public class MKAD{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        a = (a + 109) % 109;

        System.out.println((a * b) % 109);
    }
}
