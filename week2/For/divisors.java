import java.util.Scanner;

public class divisors{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //        int b = scan.nextInt();
        //        int c = scan.nextInt();
        //        int d = scan.nextInt();

        for (int i = 1; i <= a; ++i){
            if (a % i == 0){
                System.out.print(i);
                System.out.print(' ');

            }
        }

    }
}

