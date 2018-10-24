package While;

import java.util.Scanner;

public class powers{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //        int b = scan.nextInt();
        //        int c = scan.nextInt();
        //        int d = scan.nextInt();

        int i = 1;

        while (i <= a){
            System.out.print(i);
            System.out.print(' ');

            i *= 2;
        }


    }
}
