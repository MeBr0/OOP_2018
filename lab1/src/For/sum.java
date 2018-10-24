package For;

import java.util.Scanner;

public class sum{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //        int b = scan.nextInt();
        //        int c = scan.nextInt();
        //        int d = scan.nextInt();

        int cnt = 0;

        for (int i = 0; i < a; ++i){
            cnt += scan.nextInt();
        }

        System.out.print(cnt);

    }
}

