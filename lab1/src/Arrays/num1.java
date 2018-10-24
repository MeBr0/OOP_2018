package Arrays;

import java.util.Scanner;

public class num1{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //        int b = scan.nextInt();
        //        int c = scan.nextInt();
        //        int d = scan.nextInt();

        int cnt = 0;

        int[] x = new int[a];

        for (int i = 0; i < a; ++i){
            x[i] = scan.nextInt();
        }
        for (int i = 0; i < a; ++i){
            if (x[i] > 0){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}
