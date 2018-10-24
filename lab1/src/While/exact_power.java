package While;

import java.util.Scanner;

public class exact_power{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //        int b = scan.nextInt();
        //        int c = scan.nextInt();
        //        int d = scan.nextInt();

        int i = 1;
        boolean q = false;

        while (i <= a){
            if (i == a){
                q = true;
                break;
            }
            i *= 2;
        }

        if (q) System.out.print("YES");

        else System.out.print("NO");



    }
}

