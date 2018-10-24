package For;

import java.util.Scanner;

class num_divisors{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //        int b = scan.nextInt();
        //        int c = scan.nextInt();
        //        int d = scan.nextInt();

        int cnt = 0;

        for (int i = 1; i < Math.sqrt(a); ++i){
            if (a % i == 0){
                cnt++;
            }
        }

        cnt *= 2;

        if (a % Math.sqrt(a) == 0){
            cnt++;
        }

        System.out.print(cnt);

    }
}

